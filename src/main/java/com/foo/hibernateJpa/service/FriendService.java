package com.foo.hibernateJpa.service;

import com.foo.hibernateJpa.domain.Friend;
import com.foo.hibernateJpa.domain.User;
import com.foo.hibernateJpa.repository.FriendRepository;
import com.foo.hibernateJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FriendService {
    @Autowired
    FriendRepository friendRepository;
    @Autowired
    UserRepository userRepository;

    public Friend saveFriend(Integer user1, Integer user2) {
        Optional<User> entity1 = userRepository.findById(user1);
        Optional<User> entity2 = userRepository.findById(user2);
        return friendRepository.save(new Friend(null, entity1.get(), entity2.get()));
    }
}
