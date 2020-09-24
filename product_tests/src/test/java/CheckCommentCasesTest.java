import annotations.TestId;
import org.junit.Test;
import steps.LoginSteps;
import steps.MainPageSteps;

/**
 * @author daniil.timashov on 24.09.2020
 */
public class CheckCommentCasesTest {

    LoginSteps loginSteps = new LoginSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();

    /*
    @TestId(120)
    @Test
    public void fullyCommentedTest() {
        loginSteps.loginToMainPage();
        mainPageSteps.checkHeaderDisplayed();
    }
    */

    @TestId(121)
    @Test
    public void testWithOneCommentedLine() {
        loginSteps.loginToMainPage();
        //System.out.println("Login is successful");
        mainPageSteps.checkHeaderDisplayed();
    }

    @TestId(122)
    @Test
    public void testWithSeveralCommentedLines() {
        loginSteps.loginToMainPage();
        /*
        String msg = "Login is successful";
        System.out.println(msg);
         */
        mainPageSteps.checkHeaderDisplayed();
    }
}
