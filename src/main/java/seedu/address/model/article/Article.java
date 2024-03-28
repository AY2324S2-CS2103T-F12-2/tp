package seedu.address.model.article;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.tag.Tag;

/**
 * Represents an article in the address book.
 */
public class Article {
    private final String title;
    private final Set<Author> authors = new HashSet<>();
    private final LocalDateTime publicationDate;
    private final Set<Source> sources = new HashSet<>();
    private final Set<Tag> tags = new HashSet<>();
    private String link = "";

    /**
     * Enumeration of Status of an article.
     */
    public enum Status {
        DRAFT, PUBLISHED, ARCHIVED
    }

    private final Status status;

    /**
     * Constructs an Article object.
     *
     * @param title the title of the article.
     * @param authors the authors of the article.
     * @param publicationDate the date of publication.
     * @param sources the people interviewed.
     * @param tags the subject of the article.
     * @param status the current status of the article.
     */
    public Article(String title, Set<Author> authors, LocalDateTime publicationDate,
                   Set<Source> sources, Set<Tag> tags, Status status, String link) {
        requireAllNonNull(title, authors, publicationDate, sources, tags, status);
        this.title = title;
        this.authors.addAll(authors);
        this.publicationDate = publicationDate;
        this.sources.addAll(sources);
        this.tags.addAll(tags);
        this.status = status;
        this.link = link;
    }

    public String getTitle() {
        return this.title;
    }

    public Set<Author> getAuthors() {
        return Collections.unmodifiableSet(authors);
    }

    public LocalDateTime getPublicationDate() {
        return this.publicationDate;
    }

    public String getPublicationDateAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.publicationDate.format(formatter);
    }

    public Set<Source> getSources() {
        return Collections.unmodifiableSet(sources);
    }

    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    public Status getStatus() {
        return this.status;
    }

    public String getLink() {
        return this.link;
    }

    /**
     * Returns true if all the attributes of Article class are identical to the attributes of an existing Article.
     *
     * @param otherArticle
     * @return
     */
    public boolean isSameArticle(Article otherArticle) {
        if (otherArticle == this) {
            return true;

        /*
         * If it is not draft and has same title as another article,
         * consider it as same article
        */
        } else if (otherArticle.getStatus() != Status.DRAFT && this.getStatus() != Status.DRAFT
                && otherArticle.getTitle().equals(this.title)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Article)) {
            return false;
        }

        Article otherArticle = (Article) other;
        return title.equals(otherArticle.title)
                && authors.equals(otherArticle.authors)
                && sources.equals(otherArticle.sources)
                && publicationDate.equals(otherArticle.publicationDate)
                && tags.equals(otherArticle.tags)
                && status.equals(otherArticle.status)
                && link.equals(otherArticle.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authors, publicationDate, sources, tags, status, link);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("title", title)
                .add("authors", authors)
                .add("publicationDate", publicationDate)
                .add("sources", sources)
                .add("tags", tags)
                .add("status", status)
                .add("link", link)
                .toString();
    }
}
