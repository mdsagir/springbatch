package com.springbatch.dbtocsv.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
