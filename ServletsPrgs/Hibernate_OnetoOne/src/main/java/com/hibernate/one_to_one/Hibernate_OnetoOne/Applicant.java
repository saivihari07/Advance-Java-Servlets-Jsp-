package com.hibernate.one_to_one.Hibernate_OnetoOne;

public class Applicant {
    private int applicantId;
    private String name;
    private int age;
    private String city;
    private Passport passport;
   
    public int getApplicantId() {
        return applicantId;
    }
    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Passport getPassport() {
        return passport;
    }
    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}