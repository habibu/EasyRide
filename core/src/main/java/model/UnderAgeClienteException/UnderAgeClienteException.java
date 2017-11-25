package model.UnderAgeClienteException;

public class UnderAgeClienteException extends Exception {
    public UnderAgeClienteException() {
        super();
    }

    public UnderAgeClienteException(String message) {
        super(message);
    }

    public UnderAgeClienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnderAgeClienteException(Throwable cause) {
        super(cause);
    }

    protected UnderAgeClienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
