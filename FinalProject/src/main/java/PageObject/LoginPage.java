package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    public static SelenideElement
            emailInput = $(byId("EmailOrPhone")),
            passwordInput = $(byName("Password")),
            loginBtn = $(byId("login-btn")),
            loginError = $(byName("Password")),
            MyAccout = $(byClassName("welcome-text-desktop"));

    public ElementsCollection
            test = $$("dssfd");

}
