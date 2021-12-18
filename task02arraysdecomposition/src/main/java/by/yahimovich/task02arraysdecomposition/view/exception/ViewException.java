package by.yahimovich.task02arraysdecomposition.view.exception;

import by.yahimovich.task02arraysdecomposition.controller.exception.ControllerException;

public class ViewException extends ControllerException {

    public ViewException() {
    }

    public ViewException(String message) {
        super(message);
    }

    public ViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public ViewException(Throwable cause) {
        super(cause);
    }
}
