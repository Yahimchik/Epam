package by.yahimovich.task4ooprepository.entity.exception;

/**
 * Throws exception when something broke
 * with Pyramid object.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Throwable
 * @see Exception
 */

public class PyramidException extends Exception {
    public PyramidException() {
    }

    public PyramidException(String message) {
        super(message);
    }

    public PyramidException(String message, Throwable cause) {
        super(message, cause);
    }

    public PyramidException(Throwable cause) {
        super(cause);
    }

    public PyramidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
