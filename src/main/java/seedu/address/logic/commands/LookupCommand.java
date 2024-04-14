package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Lookup a person identified using it's displayed index from the address book.
 */
public class LookupCommand extends PersonCommand {

    public static final String COMMAND_WORD = "lookup";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Lookup the person identified by the index number used in the displayed person list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_LOOKUP_PERSON_SUCCESS = "Lookup Person: %1$s";

    private final Index targetIndex;

    public LookupCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToLookup = lastShownList.get(targetIndex.getZeroBased());
        model.lookupPerson(personToLookup);
        return new CommandResult(String.format(MESSAGE_LOOKUP_PERSON_SUCCESS, Messages.format(personToLookup)));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof LookupCommand)) {
            return false;
        }

        LookupCommand otherLookupCommand = (LookupCommand) other;
        return targetIndex.equals(otherLookupCommand.targetIndex);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("targetIndex", targetIndex)
                .toString();
    }
}