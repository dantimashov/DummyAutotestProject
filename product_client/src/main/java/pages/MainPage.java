package pages;

import elements.main.Article;
import elements.main.Header;
import elements.main.Sidebar;

/**
 * @author daniil.timashov on 31.08.2020
 */
public class MainPage {

    public Header header() {
        return new Header();
    }

    public Sidebar sidebar() {
        return new Sidebar();
    }

    public Article article() {
        return new Article();
    }
}
