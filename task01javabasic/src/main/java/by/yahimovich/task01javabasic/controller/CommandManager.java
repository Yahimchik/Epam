package by.yahimovich.task01javabasic.controller;

import by.yahimovich.task01javabasic.view.Manager;

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
