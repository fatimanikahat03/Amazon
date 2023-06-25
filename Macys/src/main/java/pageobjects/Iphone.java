package pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BrowserInvoke;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Iphone extends BrowserInvoke {
    public static void iPhoneSelect() throws InterruptedException {
        getDriver().findElement(By.partialLinkText("Apple iPhone 12 Mini, 64GB, Black - Unlocked (Renewed Premium)")).click();
        getDriver().findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
   getDriver().findElement(By.xpath("//*[@id='attachSiNoCoverage']/span/input")).click();
   Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")));
   String actualmsg=getDriver().findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
    String expected="Added to Cart";
          assertEquals(actualmsg,expected);
    {//"Item not Added");{
        System.out.println("Item successfully added ");
    }
    Thread.sleep(2000);
    }
}
