package io.github.berryheyy.command.exception;

public class CommandNotFoundException extends CommandException
{
    public CommandNotFoundException(String name)
    {
        super(String.format("Command \"%s\" not found.", name));
    }
}
