package com.springbatch.steplistener.processor;

import com.springbatch.steplistener.model.Employee;
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
