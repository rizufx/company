package com.qinsol.insbot.configuration.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;
import java.util.List;

@Document(collection = "CompanyConfig")
public class CompanyConfig implements Serializable{


    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

    @Id
    private Integer id;
    private String companyName;
    private List<ProductOffering> productOfferings;

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

    public List<ProductOffering> getProductOfferings() {
        return productOfferings;
    }

    public void setProductOfferings(List<ProductOffering> productOfferings) {
        this.productOfferings = productOfferings;
    }
}
