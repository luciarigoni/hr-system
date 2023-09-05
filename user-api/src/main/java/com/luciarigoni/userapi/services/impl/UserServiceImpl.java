package com.luciarigoni.userapi.services.impl;

import com.luciarigoni.userapi.domain.User;
import com.luciarigoni.userapi.repositories.UserRepository;
import com.luciarigoni.userapi.services.UserService;
import com.luciarigoni.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> {
            return new ObjectNotFoundException("Object not found");
        });
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
