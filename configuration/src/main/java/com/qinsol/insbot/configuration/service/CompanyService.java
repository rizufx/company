package com.qinsol.insbot.configuration.service;


import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbot.configuration.entity.CompanyConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fahmida on 4/10/2018.
 */

@Service
public interface CompanyService{


    public List<CompanyConfigDto> getCompanies() throws Exception;

    public CompanyConfigDto getCompanyById(Integer id) throws Exception;

    public void saveCompanyConfig(CompanyConfig config);
}
