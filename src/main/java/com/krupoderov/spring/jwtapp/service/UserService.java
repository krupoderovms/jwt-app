package com.krupoderov.spring.jwtapp.service;

import com.krupoderov.spring.jwtapp.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getall();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
