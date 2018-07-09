package com.foo.hibernateJpa.service;

import com.foo.hibernateJpa.domain.User;
import com.foo.hibernateJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User findByName(String name) {
        User user =  userRepository.findUserByName(name);
        return user;
    }
}
