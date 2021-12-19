package by.yahimovich.task02arraysdecomposition.entity.exception;

public class ArithmeticException extends Exception {
    public ArithmeticException() {
    }

    public ArithmeticException(String message) {
        super(message);
    }

    public ArithmeticException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArithmeticException(Throwable cause) {
        super(cause);
    }
}
