package by.yahimovich.task05treads.view.exception;


import by.yahimovich.task05treads.controller.exception.ControllerException;

/**
 * Throw exception for view part.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Throwable
 * @see ControllerException
 */

public class ViewException extends ControllerException {

    public ViewException() {
    }

    public ViewException(String s) {
        super(s);
    }
}
