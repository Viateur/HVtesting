package UIComponents;

import org.openqa.selenium.By;

import static UIComponents.BaseComponent.checkWebElementIsDisplayed;
import static UIComponents.BaseComponent.getText;

public class WebElementByLocator {

    private By locator;
    private String fieldValue;

    public WebElementByLocator(By locator) {
        this.locator = locator;
    }

    public  String getValue(){
        return this.fieldValue= getText(this.locator);
    }

    public  By getLocator(){
        return this.locator;
    }

    public void isDisplayed(){
        checkWebElementIsDisplayed (this.locator);
    }

}
