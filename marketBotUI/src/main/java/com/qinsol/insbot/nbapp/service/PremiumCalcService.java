package com.qinsol.insbot.nbapp.service;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbo.commons.QuoteDto;

/**
 * Created by fahmida on 4/11/2018.
 */
public interface PremiumCalcService {

    public QuoteDto calculatePremiums(QuoteDto quote, CompanyConfigDto company) throws Exception;

}
