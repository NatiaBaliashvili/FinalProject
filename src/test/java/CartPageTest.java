import StepObject.CartPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

//import static PageObject.CartPage.langBtn;

//import static PageObject.CartPage.langBtnClick;
import static DataObject.CartPageData.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class CartPageTest extends ChromeRunner {
    CartPageSteps cartPageSpets = new CartPageSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void CartMethod_1() {
        cartPageSpets.SearchBtn(SearchInput).CartClick()
                .CartMethod();
        Assert.assertTrue(cartPageSpets.DeleteBtn_1.is(visible), "კალათის შემოწმება");
        cartPageSpets.DeleteMethod();
        Assert.assertTrue(cartPageSpets.EmptyBasket.is(visible), "კალათის გასუფთავება");
        sleep(5000);

    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void CartMethod_2() {
        cartPageSpets.SearchBtn(SearchInput_1).CartClick_1()
                .CartMethod();
        Assert.assertTrue(cartPageSpets.DeleteBtn_1.is(visible), "კალათის ნახვა");
        sleep(5000);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void CartMethod_3() {
        cartPageSpets.SearchBtn(SearchInput_2).CartClick()
                .BasketMethod_1()
                .CartMethod();
        Assert.assertTrue(cartPageSpets.DeleteBtn_1.is(visible), "კალათაში გადასვლა");
        cartPageSpets.DeleteMethod();
        Assert.assertTrue(cartPageSpets.EmptyBasket.is(visible), "კალათის გასუფთავება");
        sleep(5000);

    }
}
