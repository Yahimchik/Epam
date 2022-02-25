package by.yahimovich.task4ooprepository.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Command Manager
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see CommandInterface
 */

public class CommandManager {

    private final List<CommandInterface> commands = new ArrayList<>();

    /**
     * Execute method.
     *
     * @param command lets to now the command.
     */

    public void executeCommand(CommandInterface command) {
        commands.add(command);
        command.execute();
    }
}
