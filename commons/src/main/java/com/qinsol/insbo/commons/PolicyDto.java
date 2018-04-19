package com.qinsol.insbo.commons;

import java.util.Calendar;
import java.util.List;

/**
 * Created by fahmida on 4/11/2018.
 */
public class PolicyDto {

    private String companyCode;
    private String policyNumber;
    private String accounttype;
    private String accountnumber;
    private String statuscode;
    private String statusreason;
    private Calendar statusdate;
    private String priorstatuscode;
    private String priorstatusreason;
    private Calendar priorstatusdate;
    private String suspendcode;
    private String paymentmode;
    private String paymentmethod;
    private String baseproductcode;
    private String grouppolicy;
    private String totalbasebenefit;
    private String totpremspaid;
    private String totclaimspaid;
    private String totmonthlyprem;
    private String totquartprem;
    private String totsemiprem;
    private String totannualprem;
    private String totspecialprem;
    private List<PersonDto> persons;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
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

    public String getStatusreason() {
        return statusreason;
    }

    public void setStatusreason(String statusreason) {
        this.statusreason = statusreason;
    }

    public Calendar getStatusdate() {
        return statusdate;
    }

    public void setStatusdate(Calendar statusdate) {
        this.statusdate = statusdate;
    }

    public String getPriorstatuscode() {
        return priorstatuscode;
    }

    public void setPriorstatuscode(String priorstatuscode) {
        this.priorstatuscode = priorstatuscode;
    }

    public String getPriorstatusreason() {
        return priorstatusreason;
    }

    public void setPriorstatusreason(String priorstatusreason) {
        this.priorstatusreason = priorstatusreason;
    }

    public Calendar getPriorstatusdate() {
        return priorstatusdate;
    }

    public void setPriorstatusdate(Calendar priorstatusdate) {
        this.priorstatusdate = priorstatusdate;
    }

    public String getSuspendcode() {
        return suspendcode;
    }

    public void setSuspendcode(String suspendcode) {
        this.suspendcode = suspendcode;
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

    public String getBaseproductcode() {
        return baseproductcode;
    }

    public void setBaseproductcode(String baseproductcode) {
        this.baseproductcode = baseproductcode;
    }

    public String getGrouppolicy() {
        return grouppolicy;
    }

    public void setGrouppolicy(String grouppolicy) {
        this.grouppolicy = grouppolicy;
    }

    public String getTotalbasebenefit() {
        return totalbasebenefit;
    }

    public void setTotalbasebenefit(String totalbasebenefit) {
        this.totalbasebenefit = totalbasebenefit;
    }

    public String getTotpremspaid() {
        return totpremspaid;
    }

    public void setTotpremspaid(String totpremspaid) {
        this.totpremspaid = totpremspaid;
    }

    public String getTotclaimspaid() {
        return totclaimspaid;
    }

    public void setTotclaimspaid(String totclaimspaid) {
        this.totclaimspaid = totclaimspaid;
    }

    public String getTotmonthlyprem() {
        return totmonthlyprem;
    }

    public void setTotmonthlyprem(String totmonthlyprem) {
        this.totmonthlyprem = totmonthlyprem;
    }

    public String getTotquartprem() {
        return totquartprem;
    }

    public void setTotquartprem(String totquartprem) {
        this.totquartprem = totquartprem;
    }

    public String getTotsemiprem() {
        return totsemiprem;
    }

    public void setTotsemiprem(String totsemiprem) {
        this.totsemiprem = totsemiprem;
    }

    public String getTotannualprem() {
        return totannualprem;
    }

    public void setTotannualprem(String totannualprem) {
        this.totannualprem = totannualprem;
    }

    public String getTotspecialprem() {
        return totspecialprem;
    }

    public void setTotspecialprem(String totspecialprem) {
        this.totspecialprem = totspecialprem;
    }

    public List<PersonDto> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonDto> persons) {
        this.persons = persons;
    }
}
