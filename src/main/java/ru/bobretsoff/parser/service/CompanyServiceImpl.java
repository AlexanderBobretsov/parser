package ru.bobretsoff.parser.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.bobretsoff.parser.model.Company;
import ru.bobretsoff.parser.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyRepository repository;


    @Override
    public void save(Company company) {
        repository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return repository.findAll();
    }

    @Override
    public Page<Company> companyList(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
