package by.bsu.company.matrix.exception;

/**
 * Created by HP on 17.01.2017.
 */
public class MatrixException extends Exception {

    public MatrixException() {
    }

    public MatrixException(String message) {
        super(message);
    }

    public MatrixException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatrixException(Throwable cause) {
        super(cause);
    }

    public MatrixException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
