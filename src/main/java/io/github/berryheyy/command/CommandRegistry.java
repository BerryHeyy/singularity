package io.github.berryheyy.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import io.github.berryheyy.command.exception.CommandException;
import io.github.berryheyy.command.exception.CommandExistsException;
import io.github.berryheyy.command.exception.CommandNotFoundException;

public class CommandRegistry
{
    public static final List<Command> COMMANDS = new ArrayList<>();

    public static void addCommand(Command command) throws CommandExistsException
    {
        for (Command c : COMMANDS)
        {
            if (c.getClass() == command.getClass())
                throw new CommandExistsException(command.getName());
        }

        COMMANDS.add(command);
    }

    public static void executeCommand(String name, String[] arguments) throws CommandException
    {
        getCommand(name).execute(arguments);
    }

    @Nullable
    public static Command getCommand(String name) throws CommandNotFoundException
    {
        for (Command c : COMMANDS)
        {
            if (c.getName().equals(name)) return c;
            if (Arrays.stream(c.getAlises()).anyMatch(name::equals)) return c;
        }

        throw new CommandNotFoundException(name);
    }
}
