import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {

    private final ElementsCollection resultList =
            $$x("//span[@class = 'search_result_lot_detail ng-star-inserted']");

    public ElementsCollection getLotDetails(){
        return resultList;
    }

    private final SelenideElement lotName = $x("//span[@class = 'search_result_lot_detail ng-star-inserted']");

    public SelenideElement getLotName(){
        return lotName;
    }
}
