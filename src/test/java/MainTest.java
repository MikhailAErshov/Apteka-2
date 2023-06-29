import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;
import static io.qameta.allure.Allure.step;

public class MainTest extends WebTest{
    AptekaMainPage aptekaMainPage = new AptekaMainPage();

    public void setUp() {
        open("https://aptekaeconom.com/");
//        Selenide.webdriver().driver().getWebDriver().manage().addCookie(new Cookie("current_region", "103006"));
//        refresh();
//        aptekaMainPage.confirmRegion.shouldNotBe(Condition.visible, Duration.ofSeconds(10));
    }

    @AfterEach
    public void setDown() {
        Selenide.webdriver().driver().getWebDriver().manage().deleteAllCookies();
    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
    @Test
    @DisplayName("Переход к категории товара")
    public void shouldTheDisplayOfAProductCategory() {
        step("Навести курсор на одну из категорий и нажать на подкатегорию", () -> {
            aptekaMainPage.checkTheTransitionToACategoryWithAProduct();
        });
    }
}
