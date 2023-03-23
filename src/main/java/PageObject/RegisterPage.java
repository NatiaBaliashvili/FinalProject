package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public static SelenideElement

            emailInput = $(byId("Email")),
            passwordInput = $(byId("register-password")),
            confirmPasswordInput = $(byId("ConfirmPassword")),
            registerBtn = $(byText("პროფილი")),
            registerBtnClic = $(byClassName("registration_link")),
            myprofilInput = $(byClassName("welcome-text-desktop")),
            checkInput = $(byClassName("checkmark")),
            registerInput = $(byId("register-button"));
}

