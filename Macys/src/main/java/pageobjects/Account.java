package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BrowserInvoke;

public class Account extends BrowserInvoke {
    public static void accountDetails()
    {//getDriver().findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
        WebElement webElement=getDriver().findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        String sss=webElement.getText();
        Actions actions=new Actions(getDriver());
        // actions.click(driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]")));
        actions.clickAndHold(webElement).build().perform();
        String ss=getDriver().findElement(By.linkText("Account")).getText();

        getDriver().findElement(By.linkText("Account")).click();

    }
    public static void Addressselect()
    {
        getDriver().findElement(By.partialLinkText("Your addresses")).click();

    }
}
