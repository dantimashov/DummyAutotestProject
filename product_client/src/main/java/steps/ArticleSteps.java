package steps;

import elements.main.Article;
import pages.MainPage;

/**
 * @author daniil.timashov on 31.08.2020
 */
public class ArticleSteps {

    private Article onArticle() {
        return new MainPage().article();
    }
}
