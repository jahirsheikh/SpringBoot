package com.jahir.point_of_sale_pos.controller;

import com.jahir.point_of_sale_pos.model.supplier.Company;
import com.jahir.point_of_sale_pos.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("")
    public List<Company> getAllCompany() {
        List<Company> companyList = companyRepository.findAll();
        return companyList;
    }
}
