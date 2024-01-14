package com.yashvant.SpringSecurity.services;

import com.yashvant.SpringSecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService(List<User> list) {
        this.list = list;
    }
}
