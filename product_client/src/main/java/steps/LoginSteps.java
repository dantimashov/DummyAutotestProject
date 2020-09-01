package steps;

import annotations.Step;

/**
 * @author daniil.timashov on 20.07.2020
 */
public class LoginSteps {

    @Step("Login to main page")
    public LoginSteps loginToMainPage() {
        System.out.println("Test login to main page");
        return this;
    }
}
