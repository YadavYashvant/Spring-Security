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


}
