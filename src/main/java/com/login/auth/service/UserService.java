package com.login.auth.service;

import com.login.auth.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Yash Khawale", "yash@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Raj Khawale", "raj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Harush Khawale", "harush@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ankit Khawale", "ankit@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
