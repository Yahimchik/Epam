package by.yahimovich.task05treads.service.exception;

/**
 * Throw exception for service part.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Throwable
 * @see ArithmeticException
 */

public class ServiceException extends ArithmeticException {

    public ServiceException() {
    }

    public ServiceException(String s) {
        super(s);
    }
}
