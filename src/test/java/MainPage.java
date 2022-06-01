import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public SearchPage setValue(String value) {
        $x("//input[@name='q']").val(value).pressEnter();
        return page(SearchPage.class);
    }
}
