package by.bsu.company.student.exception;

/**
 * Created by HP on 18.01.2017.
 */
public class BadStudentDateException extends Exception{

    public BadStudentDateException() {
        super();
    }

    public BadStudentDateException(String message) {
        super(message);
    }

    public BadStudentDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadStudentDateException(Throwable cause) {
        super(cause);
    }

    public BadStudentDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

