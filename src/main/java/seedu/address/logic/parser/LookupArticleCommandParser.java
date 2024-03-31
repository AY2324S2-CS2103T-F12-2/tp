package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.articlecommands.DeleteArticleCommand;
import seedu.address.logic.commands.articlecommands.LookupArticleCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new LookupArticleCommand object
 */
public class LookupArticleCommandParser {

    /**
     * Parses the given {@code String} of arguments in the context of the LookupArticleCommand
     * and returns a LookupArticleCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public LookupArticleCommand parse(String args) throws ParseException {
        try {
            String id = ParserUtil.parseID(args);
            return new LookupArticleCommand(id);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, LookupArticleCommand.MESSAGE_USAGE), pe);
        }
    }
}
