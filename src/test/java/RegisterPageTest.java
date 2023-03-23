import StepObject.LoginPageSteps;
import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;
import static DataObject.RegisterPageData.confirmPassword;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class RegisterPageTest extends ChromeRunner {
    RegisterPageSteps go = new RegisterPageSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void RegisterMethod() {
        go.RegistetBtn()
                .RegistetBtnClick()
                .EmailInput(email)
                .PasswordInput(password)
                .ConfirmPasswordInput(confirmPassword)
                .CheckBtn()
                .RegisterMethod();

        assertEquals(RegisterPageSteps.passwordInput.getValue(), password, "Password Validation");
        sleep(5000);

    }
}
