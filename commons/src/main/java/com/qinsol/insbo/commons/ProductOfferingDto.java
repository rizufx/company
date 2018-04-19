package com.qinsol.insbo.commons;



import java.util.Calendar;
import java.util.Date;

/**
 * Created by fahmida on 4/10/2018.
 */
public class ProductOfferingDto {

    private Integer id;
    private CompanyConfigDto company;
    private String name;
    private Integer minAge;
    private Integer maxAge;
    private boolean group;
    private boolean underwriting;
    private Calendar effectiveDate;
    private String status;
    private String description;
    private boolean allowPort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CompanyConfigDto getCompany() {
        return company;
    }

    public void setCompany(CompanyConfigDto company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public boolean isUnderwriting() {
        return underwriting;
    }

    public void setUnderwriting(boolean underwriting) {
        this.underwriting = underwriting;
    }

    public Calendar getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAllowPort() {
        return allowPort;
    }

    public void setAllowPort(boolean allowPort) {
        this.allowPort = allowPort;
    }
}
