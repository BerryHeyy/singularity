package io.github.berryheyy.command.exception;

public class CommandExistsException extends CommandException {
    public CommandExistsException(String name)
    {
        super(String.format("Command \"%s\" already exists.", name));
    }    
}
