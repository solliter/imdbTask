package front.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;

public class CommonAction {
    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT);
        driver.manage().timeouts().pageLoadTimeout(IMPLICIT_WAIT);
        driver.manage().timeouts().scriptTimeout(IMPLICIT_WAIT);
        return driver;
    }
}