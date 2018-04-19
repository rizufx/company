package com.qinsol.insbot.configuration.controller;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbot.configuration.converter.CompanyConfigConverter;
import com.qinsol.insbot.configuration.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fahmida on 4/10/2018.
 */
@RestController
@RequestMapping("/companyconfig")
public class CompanyConfigController {

    @Autowired
    CompanyService companyService;


    @RequestMapping("/companies")
    public List<CompanyConfigDto> getActiveCompanies() throws Exception{

        return companyService.getCompanies();

    }

    @GetMapping("/{id}")
    public CompanyConfigDto getCompanyById(@PathVariable("id") final Integer id) throws Exception{

        return companyService.getCompanyById(id);
    }

    @RequestMapping(value = "/saveCompany", method = RequestMethod.POST)
    public List<CompanyConfigDto> saveCompanyConfig(@RequestBody CompanyConfigDto companyConfigDto) throws Exception{

        companyService.saveCompanyConfig(CompanyConfigConverter.dtoToEntity(companyConfigDto));

        return companyService.getCompanies();

    }
}
