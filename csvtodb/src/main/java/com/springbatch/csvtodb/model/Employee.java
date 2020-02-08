package com.springbatch.csvtodb.model;

import lombok.Data;

@Data
public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
