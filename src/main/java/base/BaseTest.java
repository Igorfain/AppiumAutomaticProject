package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("uiautomator2")
                .setDeviceName("Android")
                .setAppPackage("com.android.settings")
                .setAppActivity(".Settings");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Log the session ID for verification
        System.out.println("Session ID: " + driver.getSessionId());
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Tearing down the test setup.");
        if (driver != null) {
            driver.quit();
        }
    }
}
