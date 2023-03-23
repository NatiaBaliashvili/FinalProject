package StepObject;

import PageObject.CartPage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.C;
import javax.crypto.SealedObject;

import static com.codeborne.selenide.Selenide.sleep;

public class CartPageSteps extends CartPage {

    @Step("fill search input")
    public CartPageSteps SearchBtn(String text) {
        SearchInput.click();
        SearchInput.setValue(text).pressEnter();
        return this;
    }

    @Step("fill apple input")
    public CartPageSteps CartClick() {
        for (int i = 0; i < 2; i++) {
            BasketBtn.get(i).click();
        }
        return this;
    }

    @Step("cart")
    public CartPageSteps CartMethod() {
        CartBtn.hover();
        CartBtnClick.click();
        sleep(5000);
        return this;
    }

    @Step("fill delete input")
    public CartPageSteps DeleteMethod() {
        for (SelenideElement i : DeleteBtn) {
            i.click();
        }
        sleep(10000);
        return this;
    }

    @Step("fill lenovo input")
    public CartPageSteps CartClick_1() {
        for (int i = 0; i < 5; i++) {
            BasketBtn.get(i).click();
        }
        return this;
    }

    @Step("buy")
    public CartPageSteps BasketMethod_1() {
        for (SelenideElement i : BasketBtn) {
            //  i.scrollTo();
            i.click();

        }
        sleep(10000);
        return this;
    }
}
