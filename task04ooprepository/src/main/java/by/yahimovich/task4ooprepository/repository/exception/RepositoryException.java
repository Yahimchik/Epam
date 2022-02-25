package by.yahimovich.task4ooprepository.repository.exception;

/**
 * Observable interface
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Exception
 * @see Throwable
 */

public class RepositoryException extends Exception {

    public RepositoryException() {
    }

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryException(Throwable cause) {
        super(cause);
    }

    public RepositoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
