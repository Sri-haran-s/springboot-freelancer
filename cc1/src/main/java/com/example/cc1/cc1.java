package com.example.cc1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class cc1 {
    @Id
    String name;
    String email;
    String country;
    String phoneNumber;
    String jobTitle;
    String fieldOfExpertise;
    String yearsOfExperience;
    String availability;
    String prefferedPaymentMethod;
    public cc1(String name, String email, String country, String phoneNumber, String jobTitle, String fieldOfExpertise,
            String yearsOfExperience, String availability, String prefferedPaymentMethod) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.fieldOfExpertise = fieldOfExpertise;
        this.yearsOfExperience = yearsOfExperience;
        this.availability = availability;
        this.prefferedPaymentMethod = prefferedPaymentMethod;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }
    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }
    public String getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public String getPrefferedPaymentMethod() {
        return prefferedPaymentMethod;
    }
    public void setPrefferedPaymentMethod(String prefferedPaymentMethod) {
        this.prefferedPaymentMethod = prefferedPaymentMethod;
    }
    public cc1()
    {
        
    }
  
}