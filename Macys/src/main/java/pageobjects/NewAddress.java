package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BrowserInvoke;

public class NewAddress extends BrowserInvoke {
    public static void addAddress() throws InterruptedException {

        getDriver().findElement(By.id("ya-myab-plus-address-icon")).click();
        Thread.sleep(2000);
    }

    public static void addNewAddress()
    {//getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-countryCode\"]/span/span/span"));
        sheet=workbook.getSheet("credentails");
       double  phoneno=sheet.getRow(2).getCell(0).getNumericCellValue();
       int phon=(int)(Math.ceil(phoneno));
       String pho=String.valueOf(phon);
        getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")).sendKeys(pho);
        String  adrees1=sheet.getRow(3).getCell(0).getStringCellValue();
getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]")).sendKeys(adrees1);
        String  adrees2=sheet.getRow(4).getCell(0).getStringCellValue();
        getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]")).sendKeys(adrees2);
        String  city=sheet.getRow(5).getCell(0).getStringCellValue();
        getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]")).sendKeys(city);
        WebElement state=getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId\"]"));
        Select select=new Select(state);
        select.selectByVisibleText("Virginia");

        double  pincode=sheet.getRow(7).getCell(0).getNumericCellValue();
        int pinc=(int)Math.ceil(pincode);
        String pin=String.valueOf(pinc);
        getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).clear();
        getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).sendKeys(pin);
        getDriver().findElement(By.xpath("//*[@id=\"address-ui-widgets-use-as-my-default\"]")).click();
    }
}
