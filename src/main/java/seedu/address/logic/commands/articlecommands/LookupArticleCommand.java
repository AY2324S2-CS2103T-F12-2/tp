package seedu.address.logic.commands.articlecommands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.PersonCommand;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Looks up an article in the article book.
 */
public class LookupArticleCommand extends PersonCommand {

    public static final String COMMAND_WORD = "lookup";

    public static final String MESSAGE_USAGE = COMMAND_WORD + " "
            + ": Looks up an article in the article book. ";

    public static final String MESSAGE_SUCCESS = "Persons in Article shown";

    private final String articleID;

    /**
     * Creates a LookupArticleCommand to look up the specified {@code Article}
     */
    public LookupArticleCommand(String id) {
        this.articleID = id;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.lookupArticle(articleID);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
