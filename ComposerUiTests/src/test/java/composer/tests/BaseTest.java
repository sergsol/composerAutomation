package composer.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/serge/IdeaProjects/ComposerUIautomation/chromedriver");
        System.setProperty("selenide.browser", "chrome");
        ProjectConfig config = ConfigFactory.create(ProjectConfig.class,System.getProperties());
        Configuration.baseUrl = config.baseUrl();
        Configuration.timeout=10000;

    }

    @AfterTest
    public void Close(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
