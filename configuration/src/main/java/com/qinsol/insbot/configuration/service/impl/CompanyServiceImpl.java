package com.qinsol.insbot.configuration.service.impl;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbot.configuration.converter.CompanyConfigConverter;
import com.qinsol.insbot.configuration.entity.CompanyConfig;
import com.qinsol.insbot.configuration.repository.CompanyRepository;
import com.qinsol.insbot.configuration.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by fahmida on 4/10/2018.
 */
@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<CompanyConfigDto> getCompanies() throws Exception{

        return companyRepository.findAll().stream().map(configEntity ->{

            try {

                return CompanyConfigConverter.entityToDto(configEntity);
            }catch(Exception e){

                e.printStackTrace();
                return null;
            }

        }).collect(Collectors.toList());
    }

    @Override
    public CompanyConfigDto getCompanyById(Integer id) throws Exception{


        return CompanyConfigConverter.entityToDto(companyRepository.findById(id));

    }

    public void saveCompanyConfig(CompanyConfig config){

        companyRepository.save(config);

    }

}
