package org.postgetman.designrest.exception;

public class ResourceNotFoundException extends BaseException{

    public ResourceNotFoundException(final String message) {
        super(message);
    }

    public ResourceNotFoundException(final String message, Throwable cause) {
        super(message, cause);
    }
}
