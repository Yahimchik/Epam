package by.yahimovich.task02arraysdecomposition.service.exception;

import by.yahimovich.task02arraysdecomposition.entity.exception.MatrixException;

public class MatrixServiceException extends MatrixException {

    public MatrixServiceException() {
    }

    public MatrixServiceException(String message) {
        super(message);
    }

    public MatrixServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatrixServiceException(Throwable cause) {
        super(cause);
    }
}
