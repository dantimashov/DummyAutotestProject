package elements.main;

import matchers.Matcher;
import web.WebElement;

/**
 * @author daniil.timashov on 01.09.2020
 */
public class HeaderMenu implements WebElement {

    @Override
    public void should(Matcher matcher) {
        System.out.println("Element header menu");
        matcher.matches();
    }

    @Override
    public void waitUntil(Matcher matcher) {
        System.out.println("Element header menu");
        matcher.matches();
    }
}
