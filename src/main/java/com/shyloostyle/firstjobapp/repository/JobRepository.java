package com.shyloostyle.firstjobapp.repository;

import com.shyloostyle.firstjobapp.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
