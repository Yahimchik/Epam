package by.yahimovich.task02arraysdecomposition.entity.exception;

/**
 * Throws exception when something broke on GenericMatrix class or GenericArray class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Throwable
 * @see Exception
 */

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
