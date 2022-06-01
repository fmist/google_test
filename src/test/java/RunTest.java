import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunTest {

    @BeforeEach
    public void setUp() {
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
