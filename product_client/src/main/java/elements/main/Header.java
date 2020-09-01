package elements.main;

import matchers.Matcher;
import web.WebElement;

/**
 * @author daniil.timashov on 31.08.2020
 */
public class Header implements WebElement {

    public HeaderMenu menu() {
        return new HeaderMenu();
    }

    @Override
    public void should(Matcher matcher) {
        System.out.println("Element header");
        matcher.matches();
    }

    @Override
    public void waitUntil(Matcher matcher) {
        System.out.println("Element header");
        matcher.matches();
    }
}
