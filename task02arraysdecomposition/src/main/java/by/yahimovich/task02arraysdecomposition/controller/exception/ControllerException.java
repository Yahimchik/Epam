package by.yahimovich.task02arraysdecomposition.controller.exception;

import by.yahimovich.task02arraysdecomposition.service.exception.ServiceException;

public class ControllerException extends ServiceException {

    public ControllerException() {
    }

    public ControllerException(String s) {
        super(s);
    }
}
