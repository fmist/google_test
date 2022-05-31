import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

public class RunTest {

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
