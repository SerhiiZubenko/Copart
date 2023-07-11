package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constants.TimeVariables.IMPLICIT_WAIT;

public class CommonAction {

    public WebDriver createDriver(){
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER){
            case "win_chrome":
               System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
