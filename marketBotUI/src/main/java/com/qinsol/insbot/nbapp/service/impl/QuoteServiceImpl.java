package com.qinsol.insbot.nbapp.service.impl;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbo.commons.QuoteDto;
import com.qinsol.insbot.nbapp.service.CompanyService;
import com.qinsol.insbot.nbapp.service.PremiumCalcService;
import com.qinsol.insbot.nbapp.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fahmida on 4/11/2018.
 */
@Service
public class QuoteServiceImpl implements QuoteService{
    @Autowired
    PremiumCalcService premiumCalcService;

    @Autowired
    CompanyService companyService;

    public QuoteDto getQuote(QuoteDto quote) throws Exception{

        quote = premiumCalcService.calculatePremiums(quote, companyService.getCompanyById(quote.getCompanycode()));

        return quote;
    }
}
