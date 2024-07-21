package com.shyloostyle.firstjobapp.service;

import com.shyloostyle.firstjobapp.controller.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    Boolean deleteAll();

    Boolean deleteById(Long id);
    Boolean updateJobById(Long id, Job job);

}
