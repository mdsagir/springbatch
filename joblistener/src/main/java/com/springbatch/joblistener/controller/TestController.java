package com.springbatch.joblistener.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    public void setJob(Job job) {
        this.job = job;
    }

    Job job;

    @GetMapping("/run")
    public BatchStatus testController() throws Exception {

        Map<String, JobParameter> maps=new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        JobParameters jobParameters=new JobParameters(maps);
        System.out.println("Before start Job");
        JobExecution jobExecution = jobLauncher.run(job, jobParameters);
        System.out.println("After Job complete "+jobExecution.getStatus());

        while (jobExecution.isRunning()) {
            System.out.println("....");

        }
        return jobExecution.getStatus();

    }
}
