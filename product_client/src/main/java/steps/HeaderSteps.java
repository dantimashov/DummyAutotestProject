package steps;

import annotations.Step;
import elements.main.Header;
import pages.MainPage;
import utils.MenuOption;

import static matchers.Matchers.displayed;

/**
 * @author daniil.timashov on 31.08.2020
 */
public class HeaderSteps {

    private Header onHeader() {
        return new MainPage().header();
    }

    @Step("Login to main page")
    public HeaderSteps clickOnMenuItem(MenuOption menuItem) {
        onHeader().menu().waitUntil(displayed());
        System.out.println("Open menu item " + menuItem);
        return this;
    }
}
