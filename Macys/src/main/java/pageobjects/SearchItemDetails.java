package pageobjects;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import reusable.BrowserInvoke;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchItemDetails extends BrowserInvoke {
   static List< WebElement> allproducts;
   static List<WebElement> price;
    static List<String> list;
    static List<String> pricee;
  static   FileOutputStream  exelfile2;

    public static void allProuductListing() throws FileNotFoundException {
        //search=sheet.getRow(0).getCell(0).getStringCellValue();
        // getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(search, Keys.ENTER);
        allproducts = getDriver().findElements(By.cssSelector(".a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style"));
        price = getDriver().findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro puis-price-instructions-style']//span[@class='a-price']"));
        list = new ArrayList<String>();
        pricee = new ArrayList<String>();
        exelfile2 = new FileOutputStream(new File("C:/Users/Lenovo/IdeaProjects/Macys/src/test/resources/testresult/testresults.xlsx"));
        workbook = new XSSFWorkbook();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        List<Double> amount = new ArrayList<Double>();

        int i = 0;
        // sheet= workbook.createSheet("price");
        for (WebElement aa : price) {
            String s1 = aa.getText();
            s1 = s1.replace("\n", ".");
            //// format the amount using the DecimalFormat instance
          /*  String s1= aa.getText();
            s1 = s1.replace ("\n", "");
            s1=s1.substring(1);
            Double d=Double.parseDouble(s1);
            //amount.add(d);

           //// pricee.add(formatted);
           // BigDecimal bd1 = new BigDecimal(d);

            NumberFormat nf = NumberFormat.getCurrencyInstance();

            nf.setCurrency(Currency.getInstance("USD"));
            String formatted = nf.format (d);
            System.out.println(formatted); // 0,20 (in French locale)

            pricee.add(formatted); */


            pricee.add(s1);
            System.out.println(s1);

        }
        for (WebElement p : allproducts) {
            list.add(p.getText());
        }
    String actul=getDriver().getTitle();
    String expec="Amazon.com : mobile phone";
    assertEquals(actul,expec);
    }


   /* public static void allProuductListing() throws InterruptedException, IOException
    {
        Thread.sleep(2000);
       // getDriver().findElement(By.id("bx-close-inside-2145613")).click();
       elementList = getDriver().findElements(By.xpath("//div[@class='priceInfo']"));
      productname=getDriver().findElements(By.className("productBrand"));
       // System.out.println(elementList.size);
        List<String> stringList=new ArrayList<String>();
        List<String> stringList2=new ArrayList<String>();
        FileOutputStream  exelfile2= new FileOutputStream(new File("C:/Users/Lenovo/IdeaProjects/Macys/src/test/resources/testresult/testresults.xlsx"));
        workbook=new XSSFWorkbook();
        int i=0;
        sheet= workbook.createSheet("price");
        for(WebElement aa   :elementList)
        {
            stringList.add(aa.getText());
            //String s=stringList.get(i);
           //sheet.createRow(i).createCell(0).setCellValue(s);
          //  i++;
           // workbook.write(exelfile2);
        }
        //i=0;
       // sheet= workbook.createSheet("brand");
        for(WebElement p:productname)
        {stringList2.add(p.getText());
//            String s=stringList2.get(i);
//            sheet.createRow(i).createCell(0).setCellValue(stringList2.get(i));
//                i++;

        }
//        workbook.write(exelfile2);
//
//        workbook.close();
//


    }*/


    //Method to store all product listing into Excel file
    public  static void storeinExcel() throws IOException {
        FileOutputStream  exelfile2= new FileOutputStream(new File("C:/Users/Lenovo/IdeaProjects/Macys/src/test/resources/testresult/testresults.xlsx"));
        workbook=new XSSFWorkbook();
        int i=0;
        sheet= workbook.createSheet("price");
        for(WebElement aa   :price)
        {
            sheet.createRow(i).createCell(0).setCellValue(aa.getText());
            i++;

        }
        i=0;
        sheet= workbook.createSheet("brand");
        for(WebElement p:allproducts)
        {
            sheet.createRow(i).createCell(0).setCellValue(p.getText());
            i++;

        }
        workbook.write(exelfile2);

        workbook.close();
    }

    public static void six4gb() throws InterruptedException {Thread.sleep(2000);
      //Applying Filter for 64GB
        String actul=getDriver().getTitle();
        String expec="Amazon.com : iPhone 12";
        assertEquals(actul,expec);

        JavascriptExecutor js=(JavascriptExecutor)getDriver();
        js.executeScript("window.scrollTo(0,5414.3017578125)");
        getDriver().findElement(By.partialLinkText("64 GB")).click();
        Thread.sleep(1000);
        String actul1=getDriver().getTitle();
        String expec1="Amazon.com: IPhone 12 - 64 GB";
        assertEquals(actul1,expec1);
    }}
