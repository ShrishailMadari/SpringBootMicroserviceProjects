package com.shyloostyle.firstjobapp.service.Impl;

import com.shyloostyle.firstjobapp.controller.Job;
import com.shyloostyle.firstjobapp.service.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job: jobs) {
            if (job.getId().equals(id)){
                return job;
            }
        }
        return null;
    }

    @Override
    public Boolean deleteAll() {
        if (jobs.isEmpty())
            return false;
        else
            jobs.clear();
        return true;
    }

    @Override
    public Boolean deleteById(Long id) {
        Iterator<Job> iterator = jobs.iterator();
        while(iterator.hasNext()) {
            Job job = iterator.next();
            if (job.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean updateJobById(Long id, Job updatedJob) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                // Update the existing job with details from updatedJob
                job.setTitle(updatedJob.getTitle());
                job.setDescription(updatedJob.getDescription());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setLocation(updatedJob.getLocation());

                // Return the updated job
                return true;
            }
        }
        // Handle the case where the job with the given ID doesn't exist
        return false;
    }

}
