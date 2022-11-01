package openEmr.utils;

import java.util.concurrent.TimeUnit;

public class BrowserUtils extends Driver{

    public static void setTime(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
