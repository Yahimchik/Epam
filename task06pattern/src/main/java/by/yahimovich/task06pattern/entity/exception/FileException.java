package by.yahimovich.task06pattern.entity.exception;

/**
 * Class representing file not found exception
 *
 * @author Egor Yahimovich
 */

public class FileException extends Exception {

    /**
     * Constructor with specified string
     *
     * @param message string
     */

    public FileException(String message) {
        super("File is incorrect, " + message);
    }

    /**
     * Constructor with specified string and exception
     *
     * @param message string
     * @param e       error covered
     */

    public FileException(String message, Throwable e) {
        super("File is incorrect, " + message, e);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

}