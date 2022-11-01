package openEmr.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    private static final String browser=ConfigurationReader.getProperties("browser");


    public static WebDriver getDriver(){
        if (driver==null){
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }

}
