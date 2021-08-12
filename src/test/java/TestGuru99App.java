import commonLib.Guru99App;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestGuru99App {


    @Test(priority = 1)
    public static void launchGuru99App() throws MalformedURLException {
        Guru99App.openGuru99App();
        }
}
