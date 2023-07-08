import org.junit.Assert;
import org.junit.Test;

/**
 * Base page of site
 */

public class CopartTests extends BaseTest{

    private final static String HOME_URL = "https://www.copart.com";
    private final static String USER_ID = "ZubrSV@gmail.com";
    private final static String INCORRECT_ID = "111";
    private final static String PASSWORD = "Explorer2023";
    private final static int EXPLICIT_TIME = 10;
    private final static String SEARCH_REQUEST = "Ford Explorer Timberline";
    private final static String EXPECTED_TEXT = "FORD EXPLORER TIMBERLINE";

    @Test
    public void logInToSiteWithCorrectData() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.openSite(HOME_URL);
        Thread.sleep(2000);
        mainPage.clickOnSinInButton();
        mainPage.clickOnMemberButton();
        mainPage.enterUsername(USER_ID);
        mainPage.enterPassword(PASSWORD);
        mainPage.clickSubmit();
        explicitWait(mainPage.getCompleteRegistrationButton(), EXPLICIT_TIME);
        Assert.assertTrue(mainPage.getCompleteRegistrationButton().isDisplayed());
    }

    @Test
    public void logInToSiteWithIncorrectIdUser() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.openSite(HOME_URL);
        Thread.sleep(2000);
        mainPage.clickOnSinInButton();
        mainPage.clickOnMemberButton();
        mainPage.enterUsername(INCORRECT_ID);
        mainPage.enterPassword(PASSWORD);
        mainPage.clickSubmit();
        explicitWait(mainPage.getAlertName(), EXPLICIT_TIME);
        Assert.assertTrue(mainPage.getAlertName().isDisplayed());
    }

    @Test
    public void checkLotDetails(){
        MainPage mainPage = new MainPage();
        mainPage.openSite(HOME_URL);
        mainPage.enterSearchRequest(SEARCH_REQUEST);
        mainPage.clickSubmitSearchButton();
        SearchResultPage searchResultPage = new SearchResultPage();
        explicitWait(searchResultPage.getLotDetails().first(), EXPLICIT_TIME);

        for (int i = 0; i < searchResultPage.getLotDetails().size(); i++) {
            Assert.assertTrue(searchResultPage.getLotDetails().get(i).getText().contains(EXPECTED_TEXT));
        }
    }
}
