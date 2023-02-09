package com.employeeApp2411.Exceptions;

public class EmployeeExceptions extends RuntimeException{
    public EmployeeExceptions() {
        super();
    }

    public EmployeeExceptions(String message) {
        super(message);
    }

    public EmployeeExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeExceptions(Throwable cause) {
        super(cause);
    }

    protected EmployeeExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
