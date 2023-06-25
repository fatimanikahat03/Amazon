package pageobjects;


import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import reusable.BrowserInvoke;

public class LoginPage extends BrowserInvoke {



        public  static void loginusername() {
//            String actul=getDriver().findElement(By.xpath("/html/head/title")).getText();
//            String expec="Amazon Sign-In";
//            assertEquals(actul,expec);
        getDriver().findElement(By.id("ap_email")).sendKeys(username);
        getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }
        public  static void passs()
    {
//        String actul=getDriver().findElement(By.xpath("/html/head/title")).getText();
//        String expec="Amazon Sign-In";
//        assertEquals(actul,expec);
        getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pass);
        getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

    }

        /*getDriver().findElement(By.cssSelector(".primary.button.signInBanner__button")).click();
        getDriver().findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
        getDriver().findElement(By.id("pw-input")).sendKeys(pass);
        getDriver().findElement(By.id("sign-in")).click();
        String acturl ="https://www.macys.com/myaccount/home?cm_sp=navigation-_-top_nav-_-my_account";
        String expectedurl= getDriver().getCurrentUrl();
       assertEquals(acturl,expectedurl,"Login failed");
        System.out.println("Login successful ");
*/    }

