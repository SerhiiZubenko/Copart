package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private static By inputSearch = By.xpath("//input[@id = 'input-search']");
    private static By searchBtn = By.xpath("//button[@data-uname = 'homepageHeadersearchsubmit']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void inputSearchField(String model){
        WebElement inputSearchField = driver.findElement(inputSearch);
        inputSearchField.sendKeys(model);
    }

    public void clickOnTheSearchButton(){
        WebElement searchButton = driver.findElement(searchBtn);
        searchButton.click();
    }
}
