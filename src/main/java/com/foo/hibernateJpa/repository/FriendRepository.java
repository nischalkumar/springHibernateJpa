package com.foo.hibernateJpa.repository;

import com.foo.hibernateJpa.domain.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
}
