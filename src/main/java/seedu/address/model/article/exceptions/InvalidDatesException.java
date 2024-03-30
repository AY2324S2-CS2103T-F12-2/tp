package seedu.address.model.article.exceptions;

/**
 * Indicates that dates entered are invalid
 */
public class InvalidDatesException extends RuntimeException {
    public InvalidDatesException() {
        super("The start date should not come after end date");
    }
}
