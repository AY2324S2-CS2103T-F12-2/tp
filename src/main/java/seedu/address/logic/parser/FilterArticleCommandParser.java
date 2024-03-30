package seedu.address.logic.parser;

import static seedu.address.logic.parser.CliSyntax.PREFIX_ARTICLETAG;
import static seedu.address.logic.parser.CliSyntax.PREFIX_END;
import static seedu.address.logic.parser.CliSyntax.PREFIX_START;
import static seedu.address.logic.parser.CliSyntax.PREFIX_STATUS;

import java.util.stream.Stream;

import seedu.address.logic.commands.articlecommands.FilterArticleCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a FilterArticleCommand object
 */
public class FilterArticleCommandParser implements Parser<FilterArticleCommand> {

    @Override
    public FilterArticleCommand parse(String userInput) throws ParseException {
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(userInput, PREFIX_STATUS,
                PREFIX_ARTICLETAG, PREFIX_START, PREFIX_END);
        if (!arePrefixesPresent(argMultimap, PREFIX_STATUS, PREFIX_ARTICLETAG, PREFIX_START, PREFIX_END)) {
            throw new ParseException("The filter command does not follow the correct format");
        }
        String status = argMultimap.getValue(PREFIX_STATUS).get();
        String tagName = argMultimap.getValue(PREFIX_ARTICLETAG).get();
        String start = argMultimap.getValue(PREFIX_START).get();
        String end = argMultimap.getValue(PREFIX_END).get();
        return new FilterArticleCommand(status, tagName, start, end);
    }

    private static boolean arePrefixesPresent(ArgumentMultimap argumentMultimap, Prefix... prefixes) {
        return Stream.of(prefixes).allMatch(prefix -> argumentMultimap.getValue(prefix).isPresent());
    }
}
