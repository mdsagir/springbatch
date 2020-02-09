package com.springbatch.steplistener.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;

public class JobListener extends JobExecutionListenerSupport {


    @Autowired
    private ExecutionContext executionContext;


    @Override
    public void afterJob(JobExecution jobExecution) {
        Set<Map.Entry<String, Object>> entries = executionContext.entrySet();

        entries.forEach(System.out::println);

        System.out.println("###"+entries.size());
    }
}
