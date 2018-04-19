package com.qinsol.insbot.nbapp.service.impl;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbo.commons.ProductOfferingDto;
import com.qinsol.insbo.commons.QuoteDto;
import com.qinsol.insbot.nbapp.service.PremiumCalcService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.stream.Collectors;

/**
 * Created by fahmida on 4/11/2018.
 */
@Service
public class PremiumCalcServiceImpl implements PremiumCalcService{

    @Override
    public QuoteDto calculatePremiums(QuoteDto quote, CompanyConfigDto company) throws Exception{

        ProductOfferingDto offering = company.getProductOfferings().get(0);

        BigDecimal premiumFactor = new BigDecimal(0.005);
        BigDecimal annualFactor = new BigDecimal(12);
        BigDecimal semiAnnualFactor = new BigDecimal(6);
        BigDecimal quarterFactor = new BigDecimal(3);

        quote.setTotannualprem(quote.getTotalbasebenefit().multiply(premiumFactor).multiply(annualFactor).setScale(2));
        quote.setTotsemiprem(quote.getTotalbasebenefit().multiply(premiumFactor).multiply(semiAnnualFactor).setScale(2));
        quote.setTotquartprem(quote.getTotalbasebenefit().multiply(premiumFactor).multiply(quarterFactor).setScale(2));
        quote.setTotmonthlyprem(quote.getTotalbasebenefit().multiply(premiumFactor).setScale(2));
        quote.setTotspecialprem(new BigDecimal(0.00).setScale(2));

        return quote;
    }
}
