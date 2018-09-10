package com.s4y.service4you.Entities;

/**
 * Created by boldi on 2018. 09. 10..
 */

public class User {
    private String UserName;
    private String Email;
    private String Password;
    private String SurName;
    private String MidName;
    private String PostNumber;
    private String Birthday;
    private String City;
    private String Address;
    private String Country;
    private String Sex;

    public String getUserName() {
        return UserName;
    }
    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public String getMidName() {
        return MidName;
    }

    public void setMidName(String midName) {
        MidName = midName;
    }

    public String getPostNumber() {
        return PostNumber;
    }

    public void setPostNumber(String postNumber) {
        PostNumber = postNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
