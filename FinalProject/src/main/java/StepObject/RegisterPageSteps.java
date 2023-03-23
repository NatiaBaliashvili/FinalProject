package StepObject;

import PageObject.RegisterPage;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byName;

public class RegisterPageSteps extends RegisterPage {
    @Step("fill profil input")
    public RegisterPageSteps MyprofilInput() {
        myprofilInput.click();
        return this;
    }

    @Step("fill email input by value: {email}")
    public RegisterPageSteps EmailInput(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("fill password input by value: {password}")
    public RegisterPageSteps PasswordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }

    @Step("fill password input by value: {confirmpassword}")
    public RegisterPageSteps ConfirmPasswordInput(String password) {
        confirmPasswordInput.setValue(password);
        return this;
    }

    @Step("Click profile")
    public RegisterPageSteps RegistetBtn() {

        registerBtn.click();
        return this;
    }

    @Step("Click register")
    public RegisterPageSteps RegistetBtnClick() {

        registerBtnClic.click();
        return this;

    }
  /*  @Step("Click register btn")
   public RegisterPageSteps RegisterBtn(){
         registerBtn.click();
        registerBtn.click(ClickOptions.withTimeout(Duration.ofMillis(5000));

    }*/

}
