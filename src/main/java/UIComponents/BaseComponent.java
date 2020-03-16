package UIComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import static Selenium.SeleniumDriver.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class BaseComponent {

    public static WebElement getWebElement (By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> getListWebElements (By locator){
        return driver.findElements(locator);
    }

    /** Actions **/
    public static void setText(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

    public static void clickButton(By locator) {
        getWebElement(locator).click();
    }
    /**read data**/
    public static String  getText(By locator){
        return getWebElement (locator).getText ();
    }

    /**Check value**/
    public static void checkStringValue ( String expectedValue, String obtainedValue){
        //String  obtainedValueTrimed = obtainedValue.trim();
        assertThat(expectedValue).isEqualTo(obtainedValue);
    }

    public static void checkStringArrayValue ( String[] expectedValue, String[] obtainedValue){
        assertThat(expectedValue).isEqualTo(obtainedValue);
    }

    public static boolean checkWebElementIsDisplayed (By locator){
        return getWebElement(locator).isDisplayed ();
    }

    public static void   hoverOn(By locator){
         Actions actions = new Actions (driver);
        actions.moveToElement(getWebElement(locator)).perform();
    }



}
