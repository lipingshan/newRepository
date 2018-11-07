package com.elitesland.userdemo.service.ex;

public class UsernameConflictException extends ServiceException {

    public UsernameConflictException() {
        super();
    }

    public UsernameConflictException(String message) {
        super(message);
    }

    public UsernameConflictException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameConflictException(Throwable cause) {
        super(cause);
    }

    protected UsernameConflictException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
