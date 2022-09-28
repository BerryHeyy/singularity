package io.github.berryheyy.command.exception;

public abstract class CommandException extends Exception
{
    public CommandException(String cause)
    {
        super(cause);
    }
}
