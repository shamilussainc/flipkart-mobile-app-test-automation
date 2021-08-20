import commonLib.Flipkart;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Utility;

import java.net.MalformedURLException;

public class FlipkartTest {
    Flipkart flipkart = new Flipkart();
    public AndroidTouchAction action;
    Utility utility = new Utility();

    @BeforeClass()
    public void setUp() throws MalformedURLException {
        flipkart.openFlipkart();
    }

    @Test()
    public void openEmptyKart(){
        flipkart.driver.findElementById("com.flipkart.android:id/cart_bg_icon").click();
        String actualText = flipkart.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android" +
                ".widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/androidx.drawerlayout.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget" +
                ".FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View[1]/android.widget." +
                "FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view." +
                "View/android.widget.TextView[1]").getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText,"Your cart is empty! ");
    }

    @Test()
    public void scrollDown() throws InterruptedException {
        //opens drawer, scroll downs to privacy policy, click on privacy policy, scroll down privacy policy page to bottom
        AndroidElement hotDog = (AndroidElement)flipkart.driver.findElementByAccessibilityId("Drawer");

        action = new AndroidTouchAction(flipkart.driver);

        action.tap(ElementOption.element(hotDog)).perform();

        utility.scrollDown(flipkart.driver);

        AndroidElement privacyPolicy = (AndroidElement) flipkart.driver.findElementByXPath("/hierarchy/android" +
                ".widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
                ".LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget" +
                ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
                ".FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[12]/android" +
                ".widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView");

        action.tap(ElementOption.element(privacyPolicy)).perform();


    }
}
