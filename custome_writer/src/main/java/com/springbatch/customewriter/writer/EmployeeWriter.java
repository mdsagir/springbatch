package com.springbatch.customewriter.writer;

import com.springbatch.customewriter.model.Employee;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeWriter implements ItemWriter<Employee> {
    

    @Override
    public void write(List<? extends Employee> items) throws Exception {

    }
}
