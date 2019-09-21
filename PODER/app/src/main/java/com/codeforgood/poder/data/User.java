package com.codeforgood.poder.data;

public class User {
    private String email;
    private String name;
    private int phoneNumber;
    private int registrationTestScore;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRegistrationTestScore() {
        return registrationTestScore;
    }

    public void setRegistrationTestScore(int registrationTestScore) {
        this.registrationTestScore = registrationTestScore;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}
