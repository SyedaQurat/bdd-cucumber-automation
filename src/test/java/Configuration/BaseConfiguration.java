package Configuration;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseConfiguration {
    public static AppiumDriver driver;

    public static void startDriver() throws IOException {
        CapabilitiesGenerator capabilities = new CapabilitiesGenerator();
        if (driver == null) {
            driver = (AppiumDriver) capabilities.setCapabilities();
        }
    }

    public static AppiumDriver getDriver() {
        if (driver != null)
        {
            return driver;
        } else
        {
            throw new WebDriverException("Exception");
        }
    }

    public static void quitDriver() {
        driver = null;
    }


    public void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
}
