package web;

import matchers.Matcher;

/**
 * @author daniil.timashov on 29.08.2020
 */
public interface WebElement {

    void should(Matcher matcher);

    void waitUntil(Matcher matcher);
}
