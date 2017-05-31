package by.dudko.computerabout.exception;

/**
 * Created by cplus on 27.05.2017.
 */
public class IncorrectValueException extends Exception {
    public IncorrectValueException() {
    }

    public IncorrectValueException(String message) {
        super(message);
    }

    public IncorrectValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectValueException(Throwable cause) {
        super(cause);
    }

    public IncorrectValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
