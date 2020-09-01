import annotations.TestGroup;
import annotations.TestId;
import org.junit.Test;
import steps.LoginSteps;
import steps.MainPageSteps;

/**
 * @author daniil.timashov on 20.07.2020
 */
@TestGroup("Main page group")
public class ProductMainPageTest {

    LoginSteps loginSteps = new LoginSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();

    @TestId(1)
    @Test
    public void checkHeaderIsShown() {
        loginSteps.loginToMainPage();
        mainPageSteps.checkHeaderDisplayed();
    }

    @TestId(2)
    @Test
    public void checkSidebarIsShown() {
        loginSteps.loginToMainPage();
        mainPageSteps.checkSidebarDisplayed();
    }

    @TestId(3)
    @Test
    public void checkArticleIsShown() {
        loginSteps.loginToMainPage();
        mainPageSteps.checkArticleDisplayed();
    }
}
