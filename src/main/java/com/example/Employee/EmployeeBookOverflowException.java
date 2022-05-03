package com.example.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class EmployeeBookOverflowException extends RuntimeException {

    private static final String DEFAULT_MASSAGE = "Employee book if full";

    public EmployeeBookOverflowException() {
        super(DEFAULT_MASSAGE);
    }

    public EmployeeBookOverflowException(String massage) {
        super(massage);
    }

    public EmployeeBookOverflowException(String massage, Throwable cause) {
        super(massage, cause);
    }

    public EmployeeBookOverflowException(Throwable cause) {
        super(cause);
    }

    public EmployeeBookOverflowException(String massage, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(massage, cause, enableSuppression, writableStackTrace);
    }
}
