package by.yahimovich.task01javabasic.manager;

import by.yahimovich.task01javabasic.controller.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class CommandManager {
    /**
     * @see Manager
     */

    private final List<Command> commands = new ArrayList<>();

    public void executeOperation(Command command) {
        commands.add(command);
        command.execute();
    }
}
