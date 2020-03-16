package UIComponents;

import org.openqa.selenium.By;

import static UIComponents.BaseComponent.checkWebElementIsDisplayed;
import static UIComponents.BaseComponent.getText;

public interface componentField {

    public  String getFieldValue();

    public  String getLabel();

    public By getValueLocator();

    public  By getLabelLocator();

    public void isDisplayed();

}
