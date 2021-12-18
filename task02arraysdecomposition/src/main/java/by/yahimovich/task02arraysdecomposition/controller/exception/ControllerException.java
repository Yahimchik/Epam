package by.yahimovich.task02arraysdecomposition.controller.exception;

import by.yahimovich.task02arraysdecomposition.service.exception.MatrixServiceException;

public class ControllerException extends MatrixServiceException {

    public ControllerException() {
    }

    public ControllerException(String message) {
        super(message);
    }

    public ControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ControllerException(Throwable cause) {
        super(cause);
    }
}
