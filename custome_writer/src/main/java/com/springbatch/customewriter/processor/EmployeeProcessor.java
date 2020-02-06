package com.springbatch.customewriter.processor;

import com.springbatch.customewriter.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProcessor implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee item) throws Exception {
        System.out.println("......Going to process "+item);
        return item;
    }
}
