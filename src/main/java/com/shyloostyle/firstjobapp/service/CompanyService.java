package com.shyloostyle.firstjobapp.service;

import com.shyloostyle.firstjobapp.Entity.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllTheCompanies();
    Boolean updateCompanyById(Company company,Long id);

    void createCompany(Company company);

    Boolean deleteById(Long id);
}
