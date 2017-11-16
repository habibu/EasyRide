package model.exceptions;

public class UnderAgeClienteException extends Exception
    {

    public UnderAgeClienteException() {
    }

    public UnderAgeClienteException(String s) {
        super(s);
    }

    public UnderAgeClienteException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UnderAgeClienteException(Throwable throwable) {
        super(throwable);
    }

    
    }
