package com.qinsol.insbot.nbapp.service;

import com.qinsol.insbo.commons.CompanyConfigDto;

/**
 * Created by fahmida on 4/11/2018.
 */
public interface CompanyService {

    public CompanyConfigDto getCompanyById(Integer id) throws Exception;
}
