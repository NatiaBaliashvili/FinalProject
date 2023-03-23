import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Severity(SeverityLevel.MINOR)
    public void UserNameOrPassword() {
        loginPageSteps.MyAccount()
                .EmailInput(email)
                .PasswordInput(password)
                .LoginBtn();
        Assert.assertTrue(LoginPageSteps.loginError.is(Condition.visible), "პაროლის ველი");
        sleep(5000);

        // loginPageSteps.SuccessfullLogin(email,password);
        //  loginPageSteps.LoginBtnClick()
        //  .EmailInput(email)
        // .PasswordInput(password);
        //   .loginPageSteps.LoginBtn();
        //  Assert.assertTrue(LoginPageSteps.loginError.is(Condition.visible));
        // sleep(5000);

    }

}
