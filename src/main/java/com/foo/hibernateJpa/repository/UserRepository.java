package com.foo.hibernateJpa.repository;

import com.foo.hibernateJpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findUserByName(String name);
}
