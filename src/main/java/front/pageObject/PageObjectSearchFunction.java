package front.pageObject;

import front.methods.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Constant.Urls.MAIN_PAGE;

public class PageObjectSearchFunction extends BasePage{

    public PageObjectSearchFunction(WebDriver driver) {
        super(driver); }

    public void open(){
        BasePage basePage = new BasePage(driver);
        basePage.open(MAIN_PAGE); }


    //Search field
    private final By fieldSearch = By.id("suggestion-search");

    //Magnify btn
    private final By btnMagnify = By.id("iconContext-magnify");

    //Drop down btn ALL on search field
    private final By dropDownBtnAll = By.xpath("//*[@class ='sc-3c88d23-0 hopFns']");

    //Empty search request page title
    public final By titleEmptyRequestPage = By.xpath("//*[@class='ipc-page-section ipc-page-section--base sc-702cc87d-1 eMoMSC']");

    //Empty search request page 2nd page
    public final By articleTypeAWord = By.xpath("//*[@class='article']");

    //Result not found section
    public final By sectionResultNotFound = By.xpath("//*[@data-testid='results-section-empty-results-msg']");

    //Result not found section 2nd page
    public final By articleResultNotFound = By.xpath("//*[@class='findHeader']");

    //Search functionality suggestion result title
    public final By suggestionTitle (String movie){return By.xpath("//*[contains(text(), '"+movie+"')]");}

    //Search functionality result detail title
    public final By detailViewTitle = By.xpath("//*[@data-testid='hero-title-block__title']");

    //Btn more titles matches
    public final By moreTitlesMatchesBtn = By.xpath("//*[contains(text(), 'More title matches')]");




    @Step("Finding Search field")
    public WebElement fieldSearchFind() {
        WebElement fieldSearchFind = driver.findElement(fieldSearch);
        waitElementIsVisible(fieldSearchFind);
        return fieldSearchFind;
    }

    @Step("Clicking Search field")
    public void fieldSearchClick() {
        fieldSearchFind().click();
    }

    @Step("Filling Search field")
    public void fieldSearchFill(String string) {
        fieldSearchClick();
        driver.findElement(fieldSearch).sendKeys(string);
    }

    @Step("Finding Magnify btn")
    public WebElement btnMagnifyFind() {
        WebElement btnMagnifyFind = driver.findElement(btnMagnify);
        waitElementIsVisible(btnMagnifyFind);
        return btnMagnifyFind;
    }

    @Step("Clicking Magnify btn")
    public void btnMagnifyClick() {
        btnMagnifyFind().click();
    }

    @Step("Finding drop down btn ALL")
    public WebElement dropDownBtnAllFind() {
        WebElement dropDownBtnAllFind = driver.findElement(dropDownBtnAll);
        waitElementIsVisible(dropDownBtnAllFind);
        return dropDownBtnAllFind;
    }

    @Step("Finding suggestion result title")
    public WebElement suggestionTitleFind(String movie) {
        WebElement suggestionTitleFind = driver.findElement(suggestionTitle(movie));
        waitElementIsVisible(suggestionTitleFind);
        return suggestionTitleFind;
    }

    @Step("Finding more titles button")
    public WebElement moreTitlesMatchesBtnFind() {
        WebElement moreTitlesMatchesBtnFind = driver.findElement(moreTitlesMatchesBtn);
        waitElementIsVisible(moreTitlesMatchesBtnFind);
        return moreTitlesMatchesBtnFind;
    }

    //2 pages here one is with less movies result, if we get this page we click btn More title matches
    @Step("Clicking movie result title")
    public void movieTitleClick(String movie) {
        try{
        suggestionTitleFind(movie).click();}
        catch (Exception NoSuchElementException){
            moreTitlesMatchesBtnFind().click();
            suggestionTitleFind(movie).click();
        }
    }

    @Step("Finding result detail title")
    public WebElement detailViewTitleFind() {
        WebElement detailViewTitleFind = driver.findElement(detailViewTitle);
        waitElementIsVisible(detailViewTitleFind);
        return detailViewTitleFind;
    }
}
