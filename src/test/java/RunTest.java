import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
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
        System.setProperty("webdriver.chrome.driver", "https://github.com/fmist/google_test/blob/57e1d65646fa9e99468108293f2436134fb3c8ce/chromedriver");
        Selenide.open("https://google.com");
    }

    @Owner("grbm")
    @Description("open main page, fill data, press enter, open first link")
    @Test
    public void test1() {
        new MainPage()
                .setValue("macbook pro")
                .getValues(0)
                .openFirstLink();
    }

    @Test
    public void test2() {
        new MainPage()
                .setValue("beyonce")
                .getValues(0)
                .openFirstLink();
    }
}
