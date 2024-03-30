package seedu.address.model.article.exceptions;

/**
 * Signals that status entered is not a valid one.
 */
public class InvalidStatusException extends RuntimeException {
    public InvalidStatusException() {
        super("The status is invalid");
    }
}
