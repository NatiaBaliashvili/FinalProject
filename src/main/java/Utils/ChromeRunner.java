package Utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod(description = "Configure browser before test")
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://zoommer.ge/");
    }

    @AfterMethod(description = "Close browser and clear cookies")
    public void tearDown() {
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}

