package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import reusable.BrowserInvoke;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class HomePage extends BrowserInvoke {
    public static void searchItem() {
        getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(search, Keys.ENTER);
    }

        public static void hom()
        {
String actul=getDriver().getTitle();
String expec="Amazon.com. Spend less. Smile more.";
            assertEquals(actul,expec);
            getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        }
    public static void home()
    {
        String actul=getDriver().getTitle();
        String expec= new String( "Amazon.com. Spend less. Smile more.");
        assertEquals(expec,actul);
        {
            System.out.println("Page title is ok");

        }

    }

        public static void searchIphone()
        {
            sheet=workbook.getSheet("search");
            search=sheet.getRow(1).getCell(0).getStringCellValue();
            getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(search, Keys.ENTER);

        }
    }

