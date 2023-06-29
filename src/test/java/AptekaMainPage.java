import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class AptekaMainPage {
    public SelenideElement confirmRegion = $x("//div[@class='confirm_region']");
    public SelenideElement tabCatalogue = $x("//a/div[contains(text(), 'Косметика')]");
    public SelenideElement tabCataloguePoint = $x("//span[contains(text(),'Гели для душа')]");
    public SelenideElement searchField = $x("//*[@id='title-search-input_fixed']");




    public SelenideElement cityButton = $x("//div[@class='buttons']/span");





    public void checkTheTransitionToACategoryWithAProduct() {
        cityButton.should(Condition.visible, Duration.ofSeconds(10)).click();
        tabCatalogue.should(Condition.visible, Duration.ofSeconds(10)).hover();
        tabCataloguePoint.should(Condition.visible, Duration.ofSeconds(10)).click();
    }
}
