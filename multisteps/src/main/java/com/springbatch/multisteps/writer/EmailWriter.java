package com.springbatch.multisteps.writer;

import com.springbatch.multisteps.model.Employee;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class EmailWriter implements ItemWriter<Employee> {

    @Override
    public void write(List<? extends Employee> list) throws Exception {


        list.forEach(l -> System.out.println("Email is send to employee :" + l));
        System.out.println("Complete the this record");
    }
}
