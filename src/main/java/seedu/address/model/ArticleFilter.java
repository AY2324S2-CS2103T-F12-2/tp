package seedu.address.model;

import static seedu.address.model.Model.PREDICATE_SHOW_ALL_ARTICLES;

import java.util.function.Predicate;

import seedu.address.model.article.Article;

/**
 * Use to filter through ArticleBook
 */
public class ArticleFilter implements Filter {
    private Predicate<Article> finalPredicate;
    public ArticleFilter() {
        finalPredicate = PREDICATE_SHOW_ALL_ARTICLES;
    }
    public void updateFilter(Predicate<Article> newPredicate) {
        finalPredicate = newPredicate;
    }
    public Predicate<Article> getFinalPredicate() {
        return finalPredicate;
    }
}
