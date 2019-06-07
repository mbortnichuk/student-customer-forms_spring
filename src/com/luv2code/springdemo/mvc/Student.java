package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

/**
 * Created by mbortnic on 4/3/19.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favouritelanguage;
    private String[] operatingSystems;

    public Student() {
        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "Untited States");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // when form is loaded, Spring will call student.getCountryOptions()
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavouritelanguage() {
        return favouritelanguage;
    }

    public void setFavouritelanguage(String favouritelanguage) {
        this.favouritelanguage = favouritelanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
