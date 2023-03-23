import StepObject.LangPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class LangPageTest extends ChromeRunner {
    @Test
    @Severity(SeverityLevel.MINOR)
    public void LangClickMethod() {
        LangPageSteps lang = new LangPageSteps();
        lang.LangBtn()
                .LangBtnClick();
        Assert.assertTrue(LangPageSteps.langBtn.is(Condition.visible), "ენის შეცვლა");
        sleep(5000);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    public void BranchMethod() {
        LangPageSteps branch = new LangPageSteps();
        branch.BranchBtnClick();
        Assert.assertTrue(LangPageSteps.branchBtn.is(Condition.visible), "ფილიალებზე გადასვლა");
        sleep(5000);
    }
}
