package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultPage extends BasePage {

    private static final By lotInfo = By.xpath("//span[@class='search_result_lot_detail ng-star-inserted']");

    public List<WebElement> getListOfLots() {
      return  driver.findElements(lotInfo);
    }

    public ResultPage(WebDriver driver) {
        super(driver);
    }
}
