package by.yahimovich.task05treads.controller.exception;

import by.yahimovich.task05treads.service.exception.ServiceException;

/**
 * Throw exception for controller part.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Throwable
 * @see ServiceException
 */

public class ControllerException extends ServiceException {

    public ControllerException() {
    }

    public ControllerException(String s) {
        super(s);
    }
}
