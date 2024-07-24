package com.shyloostyle.firstjobapp.repository;

import com.shyloostyle.firstjobapp.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
