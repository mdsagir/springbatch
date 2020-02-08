package com.springbatch.dbtocsv.mapper;

import com.springbatch.dbtocsv.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {


        Employee employee=new Employee();
        employee.setEmployeeId(resultSet.getString(1));
        employee.setFirstName(resultSet.getString(2));
        employee.setLastName(resultSet.getString(3));
        employee.setEmail(resultSet.getString(4));
        employee.setAge(resultSet.getInt(5));
        return employee;
    }
}
