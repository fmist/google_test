import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {

    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/grbm/IdeaProjects/google_test/chromedriver");
    }

    @Owner("grbm")
    @Description("open main page, fill data, press enter, open first link")
    @Test
    public void test1() {
        new MainPage()
                .openMainPage()
                .setValue("macbook pro")
                .getValues(0)
                .openFirstLink();
    }

    @Test
    public void test2() {
        new MainPage()
                .openMainPage()
                .setValue("beyonce")
                .getValues(0)
                .openFirstLink();
    }
}
