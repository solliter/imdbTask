package front.methods;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Helpers extends BasePage {

    public Helpers(WebDriver driver) {
        super(driver);
    }

    //When you sending wrong search request or empty, opening 1 of 2 pages, we checking which page opened and text
    @Step("Checking page and text in elements")
    public void checkingPageAndText(By elementsToFind,By otherElements, String text) {
        try {
            if (driver.findElement(elementsToFind).isDisplayed()) {
                assertThat(driver.findElement(elementsToFind).getText(), containsString(text));
            }
        } catch (Exception AssertionError) {
             assertThat(driver.findElement(otherElements).getText(), containsString(text));
        }
    }
}

