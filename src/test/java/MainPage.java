import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    public MainPage openMainPage() {
        Selenide.open("https://google.com");
        return this;
    }

    public SearchPage setValue(String value) {
        $x("//input[@name='q']").val(value).pressEnter();
        return page(SearchPage.class);
    }
}
