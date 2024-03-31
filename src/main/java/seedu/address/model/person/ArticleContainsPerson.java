package seedu.address.model.person;

import java.util.List;
import java.util.function.Predicate;

/**
 * Tests that a {@code Person}'s {@code Name} matches any of the keywords given.
 */
public class ArticleContainsPerson implements Predicate<Person> {


    private final List<Person> personsInArticle;

    public ArticleContainsPerson(List<Person> personsInArticle) {
        this.personsInArticle = personsInArticle;
    }

    @Override
    public boolean test(Person person) {
        return personsInArticle.contains(person);
    }

}


