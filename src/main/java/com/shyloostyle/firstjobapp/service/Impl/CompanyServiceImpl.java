package com.shyloostyle.firstjobapp.service.Impl;

import com.shyloostyle.firstjobapp.Entity.Company;
import com.shyloostyle.firstjobapp.repository.CompanyRepository;
import com.shyloostyle.firstjobapp.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllTheCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Boolean updateCompanyById(Company company,Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if (companyOptional.isPresent()){
            Company companyObject = companyOptional.get();
            companyObject.setDescription(company.getDescription());
            companyObject.setName(company.getName());
            companyObject.setJobs(company.getJobs());
            companyRepository.save(companyObject);
            return true;
        }
        return false;
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Boolean deleteById(Long id) {
            if (companyRepository.existsById(id)) {
                companyRepository.deleteById(id);
                return true;
            }
            return false;
    }
}
