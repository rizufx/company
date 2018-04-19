package com.qinsol.insbo.commons;



import java.util.List;

/**
 * Created by fahmida on 4/10/2018.
 */
public class CompanyConfigDto {

    private Integer id;
    private String companyName;
    private List<ProductOfferingDto> productOfferings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<ProductOfferingDto> getProductOfferings() {
        return productOfferings;
    }

    public void setProductOfferings(List<ProductOfferingDto> productOfferings) {
        this.productOfferings = productOfferings;
    }
}
