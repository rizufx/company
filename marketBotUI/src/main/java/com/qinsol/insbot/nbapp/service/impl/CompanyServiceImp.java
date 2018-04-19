package com.qinsol.insbot.nbapp.service.impl;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbot.nbapp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import java.util.List;

/**
 * Created by fahmida on 4/11/2018.
 */
@Service
public class CompanyServiceImp implements CompanyService {
    @Autowired
    RestTemplate restTemplate;

    public CompanyConfigDto getCompanyById(Integer id) throws Exception{

        ResponseEntity<CompanyConfigDto> companyConfig = restTemplate.exchange("http://insbotconfig/companyconfig/"+id, HttpMethod.GET, null, new ParameterizedTypeReference<CompanyConfigDto>(){});

        return companyConfig.getBody();
    }

}
