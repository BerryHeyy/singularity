package io.github.berryheyy.command;

public abstract class Command 
{
    private final String name;
    private final String[] aliases;

    public Command(String name, String... aliases)
    {
        this.name = name;
        this.aliases = aliases;
    }
    
    public String getName()
    {
        return name;
    }

    public String[] getAlises()
    {
        return aliases;
    }

    public abstract void execute(String... args);
}
