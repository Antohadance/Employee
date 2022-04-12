package com.example.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundExemption extends RuntimeException{

    private static final String DEFAULT_MESSAGE = "Employee not found";

    public EmployeeNotFoundExemption() {super(DEFAULT_MESSAGE);}

    public EmployeeNotFoundExemption(String massage){super(massage);}

    public EmployeeNotFoundExemption(String massage, Throwable cause) {super(massage,cause);}

    public EmployeeNotFoundExemption(Throwable cause) {super(cause);}

    public EmployeeNotFoundExemption(String massage,Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(massage,cause,enableSuppression,writableStackTrace);
    }
}
