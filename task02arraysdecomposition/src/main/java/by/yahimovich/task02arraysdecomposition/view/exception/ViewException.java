package by.yahimovich.task02arraysdecomposition.view.exception;

import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;

/**
 * Throw exception for view part.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see java.lang.Throwable
 * @see ControllerException
 */

public class ViewException extends ControllerException {

    public ViewException() {
    }

    public ViewException(String s) {
        super(s);
    }
}
