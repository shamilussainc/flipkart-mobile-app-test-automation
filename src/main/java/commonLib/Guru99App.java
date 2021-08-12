package commonLib;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Guru99App {
    public static AndroidDriver<AndroidElement> driver;
    public static void openGuru99App() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"AKTBBBB672700191");
        cap.setCapability("platformName","Android");
        cap.setCapability("appPackage","com.guru99app");
        cap.setCapability("appActivity","com.guru99app.MainActivity");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AndroidDriver<>(url, cap);
    }
}
