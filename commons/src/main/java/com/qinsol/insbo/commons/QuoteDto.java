package com.qinsol.insbo.commons;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 * Created by fahmida on 4/11/2018.
 */
public class QuoteDto {

    private Integer companycode;
    private String quotenumber;
    private Calendar logdate;
    private String accounttype;
    private String accountnumber;
    private String statuscode;
    private BigDecimal totmonthlyprem;
    private BigDecimal totquartprem;
    private BigDecimal totsemiprem;
    private BigDecimal totannualprem;
    private BigDecimal totspecialprem;
    private String paymentmode;
    private String paymentmethod;
    private Integer baseproductcode;
    private String grouppolicy;
    private BigDecimal totalbasebenefit;
    private List<PersonDto> persons;

    public Integer getCompanycode() {
        return companycode;
    }

    public void setCompanycode(Integer companycode) {
        this.companycode = companycode;
    }

    public String getQuotenumber() {
        return quotenumber;
    }

    public void setQuotenumber(String quotenumber) {
        this.quotenumber = quotenumber;
    }

    public Calendar getLogdate() {
        return logdate;
    }

    public void setLogdate(Calendar logdate) {
        this.logdate = logdate;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public BigDecimal getTotmonthlyprem() {
        return totmonthlyprem;
    }

    public void setTotmonthlyprem(BigDecimal totmonthlyprem) {
        this.totmonthlyprem = totmonthlyprem;
    }

    public BigDecimal getTotquartprem() {
        return totquartprem;
    }

    public void setTotquartprem(BigDecimal totquartprem) {
        this.totquartprem = totquartprem;
    }

    public BigDecimal getTotsemiprem() {
        return totsemiprem;
    }

    public void setTotsemiprem(BigDecimal totsemiprem) {
        this.totsemiprem = totsemiprem;
    }

    public BigDecimal getTotannualprem() {
        return totannualprem;
    }

    public void setTotannualprem(BigDecimal totannualprem) {
        this.totannualprem = totannualprem;
    }

    public BigDecimal getTotspecialprem() {
        return totspecialprem;
    }

    public void setTotspecialprem(BigDecimal totspecialprem) {
        this.totspecialprem = totspecialprem;
    }

    public String getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Integer getBaseproductcode() {
        return baseproductcode;
    }

    public void setBaseproductcode(Integer baseproductcode) {
        this.baseproductcode = baseproductcode;
    }

    public String getGrouppolicy() {
        return grouppolicy;
    }

    public void setGrouppolicy(String grouppolicy) {
        this.grouppolicy = grouppolicy;
    }

    public BigDecimal getTotalbasebenefit() {
        return totalbasebenefit;
    }

    public void setTotalbasebenefit(BigDecimal totalbasebenefit) {
        this.totalbasebenefit = totalbasebenefit;
    }

    public List<PersonDto> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonDto> persons) {
        this.persons = persons;
    }
}
