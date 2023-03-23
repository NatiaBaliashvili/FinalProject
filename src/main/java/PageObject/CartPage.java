package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {
    public static SelenideElement

            SearchInput = $(byId("small-searchterms")),
            CartBtn = $(".topcartlink", 0),
            CartBtnClick = $(".blue_button"),
            DeleteBtn_1 = $(".js-remove-cart-item"),
            EmptyBasket = $(".empty_basket__title");
    public ElementsCollection

            BasketBtn = $$(".basket_white"),
            DeleteBtn = $$(".js-remove-cart-item");
}
