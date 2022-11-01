package openEmr.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import openEmr.utils.BrowserUtils;
import openEmr.utils.ConfigurationReader;
import openEmr.utils.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserUtils {

    @Before
    public void initiateDriver(){
        Driver.getDriver();
        BrowserUtils.setTime();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(ConfigurationReader.getProperties("url"));
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
           try {
               byte[] data=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
               scenario.attach(data,"image/png",scenario.getName());
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    }


}
