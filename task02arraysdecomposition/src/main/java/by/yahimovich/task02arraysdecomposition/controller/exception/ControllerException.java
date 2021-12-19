package by.yahimovich.task02arraysdecomposition.controller.exception;

import by.yahimovich.task02arraysdecomposition.service.exception.ServiceException;

/**
 * Throw exception for controller part.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see java.lang.Throwable
 * @see ServiceException
 */

public class ControllerException extends ServiceException {

    public ControllerException() {
    }

    public ControllerException(String s) {
        super(s);
    }
}
