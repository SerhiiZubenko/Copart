import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page of Copart.com site
*/

public class MainPage {

    private final SelenideElement sinInButton = $x("//a[@class = 'btn btn-sign-in']");
    private final SelenideElement memberButton = $x("//a[@access-value = 'member']");
    private final SelenideElement userNameInput = $x("//input[@id= 'username']");
    private final SelenideElement passwordInput = $x("//input[@id= 'password']");
    private final SelenideElement submitButton =
            $x("//button[@class = 'btn btn-lblue loginfloatright margin15']");
    private final SelenideElement completeRegistrationButton = $x("//h3[@class = 'modal-title bold']");
    private final SelenideElement alertName = $x("//span[contains(text(), \' User ID\')]");
    private final SelenideElement placeholder =$x("//input[@class = " +
                    "'form-control my_textarea newsearch pl-5 ng-pristine ng-untouched ng-valid ng-empty']");
    private final SelenideElement submitSearchButton = $x("//button[contains(text(),'Search Inventory')]");

    /**
     * Open main page of our site
     * @param url host's site
     */
    public void openSite (String url){
        Selenide.open(url);
    }

    /**
     * Click on the Sin In button
     */
    public void clickOnSinInButton(){
        sinInButton.click();
    }

    public void clickOnMemberButton(){
        memberButton.click();
    }
    public void enterUsername(String name){
        userNameInput.setValue(name);
    }
    public void enterPassword(String password){
        passwordInput.setValue(password);
    }
    public void clickSubmit(){
        submitButton.click();
    }
    public SelenideElement getCompleteRegistrationButton(){
        return completeRegistrationButton;
    }
    public SelenideElement getAlertName(){
        return alertName;
    }

    public void enterSearchRequest(String request){
        placeholder.setValue(request);
    }

    public void clickSubmitSearchButton(){
        submitSearchButton.click();
    }
}
