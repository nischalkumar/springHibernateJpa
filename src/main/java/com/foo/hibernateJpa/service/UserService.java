package com.foo.hibernateJpa.service;

import com.foo.hibernateJpa.domain.User;
import com.foo.hibernateJpa.repository.CustomUserRepo;
import com.foo.hibernateJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CustomUserRepo customUserRepo;

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User findByName(String name) {
        List<User> users =  customUserRepo.getUser(name);
        return users.get(0);
    }

    public User findUserByEmail(String email) {
        return userRepository.retrieveUserByEmail(email);
    }
}
