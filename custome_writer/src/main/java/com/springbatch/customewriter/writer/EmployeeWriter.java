package com.springbatch.customewriter.writer;

import com.springbatch.customewriter.model.Employee;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeWriter implements ItemWriter<Employee> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void write(List<? extends Employee> items) throws Exception {

         String updateQuery="insert into employee (employeeId, firstName, lastName, email, age) " +
                 "values (?, ?, ?, ?, ?)";
        jdbcTemplate.batchUpdate(updateQuery, new BatchPreparedStatementSetter() {

            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {

                Employee employee = items.get(i);

                ps.setString(1, employee.getEmployeeId());
                ps.setString(2,employee.getFirstName());
                ps.setString(3,employee.getLastName());
                ps.setString(4,employee.getEmail());
                ps.setInt(5,employee.getAge());

            }

            public int getBatchSize() {
                return items.size();
            }

        });
    }
}
