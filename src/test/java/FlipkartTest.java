import commonLib.Flipkart;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FlipkartTest {
    Flipkart flipkart = new Flipkart();

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
}
