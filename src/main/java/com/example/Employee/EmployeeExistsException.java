package com.example.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeExistsException extends RuntimeException {

    public EmployeeExistsException() {
        super("Employee Book already contains this employee");
    }

    public EmployeeExistsException(String massage) {
        super(massage);
    }

    public EmployeeExistsException(String massage, Throwable cause) {
        super(massage, cause);
    }

    public EmployeeExistsException(Throwable cause) {
        super(cause);
    }

    public EmployeeExistsException(String massage, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(massage, cause, enableSuppression, writableStackTrace);
    }
}
