package com.yashvant.SpringSecurity.models;
public class User {
    String username;
    String password;
    String emailId;

    public User(){

    }

    public User(String username, String password, String emailId) {
        this.username = username;
        this.password = password;
        this.emailId = emailId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
