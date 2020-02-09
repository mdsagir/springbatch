package com.springbatch.steplistener.listener;

import com.springbatch.steplistener.model.Employee;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ReaderListener implements ItemReadListener<Employee> {

    @Autowired
    private ExecutionContext executionContext;


    @Override
    public void beforeRead() {
        System.out.println("Before Read Listener..");
    }

    @Override
    public void afterRead(Employee employee) {
        System.out.println("After read Listener:"+employee);
    }

    @Override
    public void onReadError(Exception e) {

       String str= ((FlatFileParseException)e).getInput();
       executionContext.put(new Date().toString(),str);
        System.err.println("On error "+str);
    }
}
