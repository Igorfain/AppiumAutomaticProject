package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BatteryPage;
import utils.Logger;

import static org.testng.Assert.assertEquals;

public class BatteryTest extends BaseTest {

    @Test(description = "Verify battery percentage and toggle action in the Battery settings")
    public void testBatteryOperations() {
        BatteryPage batteryPage = new BatteryPage(driver);

        Logger.log("Step 1: Navigating to 'Battery' settings.");
        batteryPage.navigateToBatterySettings();

        Logger.log("Step 2: Retrieving battery percentage.");
        String batteryPercentage = batteryPage.getBatteryPercentage();
        System.out.println("Battery Percentage: " + batteryPercentage);
        assertEquals("100%", batteryPercentage);

        Logger.log("Step 3: Toggling battery percentage display.");
        batteryPage.toggleBatteryStatus();

        System.out.println("Test Completed Successfully.");
    }
}
