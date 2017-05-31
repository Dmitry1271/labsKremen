package by.dudko.electricalappliances.exception;

import java.lang.reflect.Executable;

/**
 * Created by cplus on 26.05.2017.
 */
public class BadDataException extends Exception {
    public BadDataException() {
    }

    public BadDataException(String message) {
        super(message);
    }

    public BadDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadDataException(Throwable cause) {
        super(cause);
    }

    public BadDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
