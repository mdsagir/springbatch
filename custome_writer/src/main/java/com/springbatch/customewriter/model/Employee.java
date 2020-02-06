package com.springbatch.customewriter.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
