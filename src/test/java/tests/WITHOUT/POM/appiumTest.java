package tests.WITHOUT.POM;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;
import java.time.Duration;


import static org.testng.Assert.assertEquals;

public class appiumTest {

    private AndroidDriver driver;

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

    @Test(description = "Verify battery percentage and toggle action in the Battery settings")
    public void testBatteryOperations() {
        try {

            // Scroll and click on "Battery"
            System.out.println("Test1: Scrolling to and clicking on the 'Battery' option.");
            WebElement batteryOption = driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Battery\"));"
            ));
            batteryOption.click();

            // Read the battery percentage label
            System.out.println("Test2: Reading the battery percentage label.");
            WebElement batteryPercentageLabel = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.android.settings:id/battery_percent']"));
            String batteryPercentage = batteryPercentageLabel.getText();
            System.out.println("Battery Percentage: " + batteryPercentage);
            assertEquals("100%", batteryPercentage);

            // Locate and click the "Show battery percentage in status bar" toggle button
            System.out.println("Test3: Performing tap action on the toggle button.");
            WebElement toggleButton = driver.findElement(AppiumBy.id("android:id/switch_widget"));
            toggleButton.click();

        } catch (Exception e) {
            System.err.println("Error during testBatteryOperations: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Tearing down the test setup.");
        if (driver != null) {
            driver.quit();
        }
    }
}