package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class Utility {
    AndroidTouchAction action;

    public void scrollDown(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int)(dimension.getHeight()* 0.8);
        int scrollEnd = (int)(dimension.getHeight()* 0.2);

        action = new AndroidTouchAction(driver)
                .press(PointOption.point(10,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(10,scrollEnd))
                .release()
                .perform();

    }
}
