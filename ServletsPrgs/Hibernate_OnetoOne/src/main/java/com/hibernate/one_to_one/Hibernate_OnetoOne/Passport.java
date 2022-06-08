package com.hibernate.one_to_one.Hibernate_OnetoOne;

import java.util.Date;

public class Passport {
    private int passportId;
    private String passportNumber;
    private Date issuedDate;
    private Date expiryDate;
    private Applicant applicant;
   
    public int getPassportId() {
        return passportId;
    }
    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public Date getIssuedDate() {
        return issuedDate;
    }
    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public Applicant getApplicant() {
        return applicant;
    }
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
