package actions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActionsHelper {

    private final AndroidDriver driver;

    public ActionsHelper(AndroidDriver driver) {
        this.driver = driver;
    }

    /**
     * Clicks on an element located by the provided By locator.
     * @param locator By locator of the element to click.
     */
    public void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    /**
     * Retrieves the text of an element located by the provided By locator.
     * @param locator By locator of the element.
     * @return Text content of the element.
     */
    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        String text = element.getText();
        return text;
    }

    /**
     * Checks if an element is displayed.
     * @param locator By locator of the element.
     * @return True if the element is displayed, otherwise false.
     */
    public boolean isDisplayed(By locator) {
        boolean isDisplayed = driver.findElement(locator).isDisplayed();
        return isDisplayed;
    }
}
