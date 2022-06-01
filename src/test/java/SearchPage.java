import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    public SearchPage getValues(int value) {
        $$x("//h3").shouldHave(CollectionCondition.sizeGreaterThan(value));
        return this;
    }

    public void openFirstLink() {
        $x("//h3").click();
    }
}
