package com.luciarigoni.userapi.services;

import com.luciarigoni.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
