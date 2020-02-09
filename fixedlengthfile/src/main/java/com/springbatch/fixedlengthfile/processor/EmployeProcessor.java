package com.springbatch.fixedlengthfile.processor;

import com.springbatch.fixedlengthfile.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class EmployeProcessor  implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee item) throws Exception {
        System.out.println("......Going to process "+item);
        return item;
    }
}
