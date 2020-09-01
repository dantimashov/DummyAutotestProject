package steps;

import annotations.Step;
import pages.MainPage;

import static matchers.Matchers.displayed;

/**
 * @author daniil.timashov on 20.07.2020
 */
public class MainPageSteps {

    private MainPage onMainPage() {
        return new MainPage();
    }

    @Step("Check header is displayed")
    public MainPageSteps checkHeaderDisplayed() {
        onMainPage().header().should(displayed());
        return this;
    }

    @Step("Check sidebar is displayed")
    public MainPageSteps checkSidebarDisplayed() {
        onMainPage().sidebar().should(displayed());
        return this;
    }

    @Step("Check article is displayed")
    public MainPageSteps checkArticleDisplayed() {
        onMainPage().article().should(displayed());
        return this;
    }
}
