package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;

/**
 * Interface command
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see ControllerException
 */

public interface Command {

    /**
     * Calculation template for commands
     *
     * @throws ControllerException This exception throws at the moment when the passed array is not created correctly
     */

    void execute() throws ControllerException;
}
