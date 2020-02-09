package com.springbatch.multisteps.processor;

import com.springbatch.multisteps.model.Employee;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeProcessor  implements ItemProcessor<Employee,Employee> {

    @Autowired
    private ExecutionContext executionContext;

    @Override
    public Employee process(Employee item) throws Exception {
        System.out.println("......Going to process "+item);


        item.setEmployeeId(item.getEmployeeId()+executionContext.getString("key"));

        if (item.getFirstName().equals("Java")){
            //To skipping any item return null
            return null;
        }
        return item;

    }
}
