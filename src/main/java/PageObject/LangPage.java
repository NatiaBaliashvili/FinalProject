package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LangPage {
    public static SelenideElement

            langBtn = $(byClassName("language_dropdown")),
            langBtnClick = $(byClassName("js-language-select"), 1),
            branchBtn = $(byText("ფილიალები"), 0);


}
