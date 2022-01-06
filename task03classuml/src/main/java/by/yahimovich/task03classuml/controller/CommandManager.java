package by.yahimovich.task03classuml.controller;

import by.yahimovich.task03classuml.controller.exception.ControllerException;
import by.yahimovich.task03classuml.insurance.service.exception.ServiceException;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private final List<CommandInterface> commands = new ArrayList<>();

    /**
     * Execute command
     *
     * @param command 1st parameter lets to know the command.
     * @throws ControllerException see exception class.
     */

    public void executeOperation(CommandInterface command) throws ControllerException {
        commands.add(command);
        command.execute();
    }
}
