package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.service.exception.ServiceException;

import java.util.ArrayList;
import java.util.List;

/**
 * Command manager
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 * @see List
 * @see ArrayList
 */

public class CommandManager {

    private final List<Command> commands = new ArrayList<>();

    /**
     * Execute command
     *
     * @param command 1st parameter lets to know the command.
     * @throws ControllerException see exception class.
     */

    public void executeOperation(Command command) throws ControllerException {
        try {
            commands.add(command);
            command.execute();
        } catch (ServiceException e) {
            throw new ControllerException();
        }
    }
}
