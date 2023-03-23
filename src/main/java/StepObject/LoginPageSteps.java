package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

import static DataObject.LoginPageData.email;
//import static PageObject.RegisterPage.registerBtn;

public class LoginPageSteps extends LoginPage {
    @Step("fill email input by value: {email}")
    public LoginPageSteps EmailInput(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("fill password input by value: {password}")
    public LoginPageSteps PasswordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }

    @Step("Click login btn")
    public LoginPageSteps LoginBtnClick() {
        loginBtn.click();
        return this;
    }

    @Step("Click my account")
    public LoginPageSteps MyAccount() {
        MyAccout.click();
        return this;
    }

    @Step("Click password")
    public LoginPageSteps LoginBtn() {
        loginBtn.click();
        loginError.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }

     /* public LoginPageSteps SuccessfullLogin(String email, String password){
        EmailInput(email);
        PasswordInput(password);
        registerBtn.click();
        return this;

    }*/

}
