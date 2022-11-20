package front;

import front.common.CommonAction;
import front.methods.Helpers;
import front.pageObject.PageObjectSearchFunction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import static constants.Constant.Configuration.CLEAR_COOKIES_AND_STORAGE;
import static constants.Constant.Configuration.HOLD_BROWSER_OPEN;


public class BaseFront {
    public static WebDriver driver = CommonAction.createDriver();
    public static PageObjectSearchFunction searchFunction = new PageObjectSearchFunction(driver);
    public static Helpers helpers = new Helpers(driver);

    @AfterMethod(alwaysRun = true)
    public void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        if(HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }

}
