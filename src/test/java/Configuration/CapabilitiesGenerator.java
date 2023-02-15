package Configuration;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;
import static Configuration.BaseConfiguration.driver;

public class CapabilitiesGenerator {

    DesiredCapabilities caps = new DesiredCapabilities();
    public WebDriver setCapabilities() throws IOException {
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone 11 Pro" );
        caps.setCapability("platformVersion", "16.0");
        caps.setCapability("platformName","");
        caps.setCapability("app", "/Users/syeda.quratulain/Downloads/Cotton_Traders.ipa");
        caps.setCapability("AutomationName", "XCUITest");
        driver = new IOSDriver(new URL("0.0.0.0:4723"), caps);
        System.out.println(driver);
        return driver;
    }
}

