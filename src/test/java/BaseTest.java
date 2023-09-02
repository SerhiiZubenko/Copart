import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import pages.HomePage;
import pages.ResultPage;

import static constants.Constants.TimeVariables.URL_SITE;

public class BaseTest {

    WebDriver driver = CommonAction.createDriver();
    BasePage basePage = new BasePage(driver);
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);

    @BeforeTest
    public void openBrowser(){
        driver.get(URL_SITE);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

    public void clearCookieAndStorage(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeScript("window.sessionStorage.clear()");

    }
}
