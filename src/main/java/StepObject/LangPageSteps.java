package StepObject;

import PageObject.LangPage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class LangPageSteps extends LangPage {
    @Step(" lang btn")
    public LangPageSteps LangBtn() {
        langBtn.click();
        return this;
    }

    @Step("Click lang btn")
    public LangPageSteps LangBtnClick() {
        langBtnClick.click();
        return this;
    }

    @Step("Click branch btn")
    public LangPageSteps BranchBtnClick() {
        branchBtn.click();
        return this;
    }

}
