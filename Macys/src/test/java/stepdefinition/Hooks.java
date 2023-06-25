package stepdefinition;

import com.aventstack.extentreports.model.ScreenCapture;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BrowserInvoke;

import java.io.IOException;


public class Hooks {
    @Before()
    public void Browserinvokee() throws IOException {
        BrowserInvoke.bowserInvocation();
    }
    @After()
    public void afterstp()
    {
        System.out.println("End of the execution");

    }

    @AfterStep()
    public void Aftrstep(Scenario scenario)
    {
        byte[] b=((TakesScreenshot)BrowserInvoke.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(b,"image/png",scenario.getName());

    }

}
