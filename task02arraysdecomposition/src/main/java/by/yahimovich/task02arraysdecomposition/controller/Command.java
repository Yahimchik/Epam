package by.yahimovich.task02arraysdecomposition.controller;

import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;
import by.yahimovich.task02arraysdecomposition.entity.exception.ArrayException;
import by.yahimovich.task02arraysdecomposition.entity.exception.MatrixException;

/**
 * Interface command
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see ArrayException
 * @see MatrixException
 */

public interface Command {

    /**
     * Calculation template for commands
     *
     * @throws ArrayException  This exception throws at the moment when the passed array is not created correctly
     * @throws ControllerException This exception throws at the moment when the passed array is not created correctly
     */

    void execute() throws ArrayException, ControllerException;
}
