package pages;

import actions.ActionsHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BatteryPage {

    private final ActionsHelper actionsHelper;

    // Locators
    private final By batteryOption = AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Battery\"));"
    );
    private final By batteryPercentageLabel = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.android.settings:id/battery_percent']");
    private final By toggleButton = AppiumBy.id("android:id/switch_widget");

    public BatteryPage(AndroidDriver driver) {
        this.actionsHelper = new ActionsHelper(driver);
    }

    public void navigateToBatterySettings() {
        actionsHelper.click(batteryOption);
    }

    public String getBatteryPercentage() {
        return actionsHelper.getText(batteryPercentageLabel);
    }

    public void toggleBatteryStatus() {
        actionsHelper.click(toggleButton);
    }
}
