package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserInvoke {
    public   static String username=null,pass=null,search=null,urll=null;
    public static double pass1;

    public static    FileInputStream exelfile;

    public static   XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public static Properties prob;
    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();
    public static WebDriver bowserInvocation() throws IOException {

        String path = System.getProperty("user.dir");
        FileInputStream inputStream = new FileInputStream(new File(path + "/src/main/resources/Utility/enviorment.properties"));
        prob = new Properties();
        prob.load(inputStream);
//        EdgeOptions e = new EdgeOptions();
//        e.setAcceptInsecureCerts(true);
//        e.addArguments("--disable-notifications");

        switch (prob.getProperty("browser").toLowerCase()){

            case "chrome":
                threadLocal.set(new ChromeDriver());
                break;
            case "edge":
                threadLocal.set(new EdgeDriver());

                break;
            default:
                throw new InvalidArgumentException("invalid browser name");
        }

      //  getDriver().navigate().to(prob.getProperty("url"));

        getDriver().manage().window().maximize();
        exelData();
        getDriver().get(urll);
       // exelData();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return getDriver();

    }

    public static WebDriver getDriver(){

        return threadLocal.get();
    }

    public static void exelData() throws IOException {
        exelfile= new FileInputStream(new File("C:/Users/Lenovo/IdeaProjects/Macys/src/main/resources/TestData/Macys.xlsx"));
        workbook=new XSSFWorkbook(exelfile);
        sheet=workbook.getSheet("credentails");
        username=sheet.getRow(0).getCell(0).getStringCellValue();
        pass1=sheet.getRow(1).getCell(0).getNumericCellValue();
        int newpass=(int)Math.ceil(pass1);
        pass=String.valueOf(newpass);
        sheet=workbook.getSheet("search");
        search=sheet.getRow(0).getCell(0).getStringCellValue();
        sheet=workbook.getSheet("url");
        urll=sheet.getRow(0).getCell(0).getStringCellValue();

    }


}


