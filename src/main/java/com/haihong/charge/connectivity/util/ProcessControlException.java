package com.haihong.charge.connectivity.util;

public class ProcessControlException extends Exception {

    private static final long serialVersionUID = -4688759004831483060L;

    public ProcessControlException() {
        super();
    }

    public ProcessControlException(String string) {
        super(string);
    }

    public ProcessControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessControlException(Throwable cause) {
        super(cause);
    }

    protected ProcessControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
