package com.example.Employee;

import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final String firstName;
    public final String lastName;

    public Employee(String firstName,String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String toString(){
        return
                        "; Имя сотрудника: " + firstName +
                        "; Фамилия сотрудника: " + lastName +
                        ";";
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName,employee.firstName) && Objects.equals(lastName,employee.lastName);
    }

    public int hashCode(){
        return Objects.hash(firstName,lastName);}
}