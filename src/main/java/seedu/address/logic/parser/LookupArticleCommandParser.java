package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.articlecommands.DeleteArticleCommand;
import seedu.address.logic.commands.articlecommands.LookupArticleCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class LookupArticleCommandParser {
    public LookupArticleCommand parse(String args) throws ParseException {
        try {
            String id = ParserUtil.parseID(args);
            assert id.equals("1") : "1_" + id + "_";
            return new LookupArticleCommand(id);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, LookupArticleCommand.MESSAGE_USAGE), pe);
        }
    }
}
