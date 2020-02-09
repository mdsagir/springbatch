package com.springbatch.steplistener.listener;

import com.springbatch.steplistener.model.Employee;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class WriterListener implements ItemWriteListener<Employee> {

    @Override
    public void beforeWrite(List<? extends Employee> list) {

    }

    @Override
    public void afterWrite(List<? extends Employee> list) {

    }

    @Override
    public void onWriteError(Exception e, List<? extends Employee> list) {

    }
}
