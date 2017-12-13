package org.postgetman.designrest.exception;

public class BaseException extends RuntimeException{

    protected BaseException(final String message) {
        super(message);
    }

    protected BaseException(final String message, Throwable cause) {
        super(message, cause);
    }
}
