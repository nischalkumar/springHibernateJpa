package com.foo.hibernateJpa.repository;

import com.foo.hibernateJpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findUserByName(String name);


    @Query("select u from User u where u.email = :email")
    User retrieveUserByEmail(@Param("email") String email);
}
