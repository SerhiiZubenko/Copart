import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseTest{

    private final String SEARCH_OF_MODEL = "FORD EXPLORER TIMBERLINE";

    @Test(priority = 1)
    public void checkSearchByModel (){
        homePage.inputSearchField(SEARCH_OF_MODEL);
        homePage.clickOnTheSearchButton();
        for(WebElement element : resultPage.getListOfLots()){
            Assert.assertTrue(element.getText().contains(SEARCH_OF_MODEL));
        }
    }
}
