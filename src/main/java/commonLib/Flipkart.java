package commonLib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Flipkart {
    public AppiumDriver driver;
    public void openFlipkart() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"my device");
        cap.setCapability("platformName","Android");
        cap.setCapability("appPackage","com.flipkart.android");
        cap.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
        cap.setCapability("noReset",true);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AppiumDriver(url, cap);
    }

}
