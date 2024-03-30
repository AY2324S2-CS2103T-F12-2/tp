package seedu.address.model.article;

import java.time.LocalDateTime;
import java.util.function.Predicate;

import seedu.address.model.article.exceptions.InvalidDatesException;

/**
 * Ensures that an {@code Article}'s {@code LocalDateTime} falls within desired period.
 */
public class ArticleMatchesTimePeriodPredicate implements Predicate<Article> {
    private LocalDateTime start;
    private LocalDateTime end;

    /**
     * Constructs a predicate that tests if article was published in desired time period.
     * @param start The earliest date the article could have been published.
     * @param end The latest date the article could have been published.
     */
    public ArticleMatchesTimePeriodPredicate(LocalDateTime start, LocalDateTime end) throws InvalidDatesException {
        this.start = start;
        this.end = end;
        if (end.isBefore(start)) {
            throw new InvalidDatesException();
        }
    }

    @Override
    public boolean test(Article article) {
        LocalDateTime articleDate = article.getPublicationDate();
        return articleDate.isAfter(start) && articleDate.isBefore(end);
    }
}
