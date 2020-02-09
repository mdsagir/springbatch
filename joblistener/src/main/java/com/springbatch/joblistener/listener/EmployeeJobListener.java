package com.springbatch.joblistener.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class EmployeeJobListener extends JobExecutionListenerSupport {


    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Before Job Listener calling..");
    }

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("After Job Listener calling..");
    }
}
