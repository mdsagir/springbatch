package com.springbatch.steplistener.listener;

import com.springbatch.steplistener.model.Employee;
import org.springframework.batch.core.ItemProcessListener;


public class ProcessListener implements ItemProcessListener<Employee, Employee> {


    @Override
    public void beforeProcess(Employee employee) {

        System.out.println("Process Listener");
    }

    @Override
    public void afterProcess(Employee employee, Employee employee2) {
        System.out.println("After Process Listener");
    }

    @Override
    public void onProcessError(Employee employee, Exception e) {

    }
}
