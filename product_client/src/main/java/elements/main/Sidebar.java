package elements.main;

import matchers.Matcher;
import web.WebElement;

/**
 * @author daniil.timashov on 31.08.2020
 */
public class Sidebar implements WebElement {

    @Override
    public void should(Matcher matcher) {
        System.out.println("Element sidebar");
        matcher.matches();
    }

    @Override
    public void waitUntil(Matcher matcher) {
        System.out.println("Element sidebar");
        matcher.matches();
    }
}
