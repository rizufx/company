package com.qinsol.insbot.configuration.converter;

import com.qinsol.insbo.commons.CompanyConfigDto;
import com.qinsol.insbo.commons.ProductOfferingDto;
import com.qinsol.insbot.configuration.entity.CompanyConfig;
import com.qinsol.insbot.configuration.entity.ProductOffering;

import java.util.stream.Collectors;

/**
 * Created by fahmida on 4/10/2018.
 */
public class CompanyConfigConverter {

    public static CompanyConfigDto entityToDto(CompanyConfig config) throws Exception {

        CompanyConfigDto configDto = new CompanyConfigDto();
        configDto.setCompanyName(config.getCompanyName());
        configDto.setId(config.getId());
        configDto.setProductOfferings(config.getProductOfferings().stream().map(

                product -> {

                    ProductOfferingDto offering = new ProductOfferingDto();
                    offering.setId(product.getId());
                    offering.setAllowPort(product.isAllowPort());
                    offering.setDescription(product.getDescription());
                    offering.setEffectiveDate(product.getEffectiveDate());
                    offering.setGroup(product.isGroup());
                    offering.setMaxAge(product.getMaxAge());
                    offering.setMinAge(product.getMinAge());
                    offering.setName(product.getName());
                    offering.setStatus(product.getStatus());
                    offering.setUnderwriting(product.isUnderwriting());

                    return offering;
                }

        ).collect(Collectors.toList()));

        return configDto;
    }

    public static CompanyConfig dtoToEntity(CompanyConfigDto config) throws Exception {

        CompanyConfig configDto = new CompanyConfig();
        configDto.setCompanyName(config.getCompanyName());
        configDto.setId(config.getId());
        configDto.setProductOfferings(config.getProductOfferings().stream().map(

                product -> {

                    ProductOffering offering = new ProductOffering();
                    offering.setAllowPort(product.isAllowPort());
                    offering.setId(product.getId());
                    offering.setDescription(product.getDescription());
                    offering.setEffectiveDate(product.getEffectiveDate());
                    offering.setGroup(product.isGroup());
                    offering.setMaxAge(product.getMaxAge());
                    offering.setMinAge(product.getMinAge());
                    offering.setName(product.getName());
                    offering.setStatus(product.getStatus());
                    offering.setUnderwriting(product.isUnderwriting());

                    return offering;
                }

        ).collect(Collectors.toList()));

        return configDto;
    }

}
