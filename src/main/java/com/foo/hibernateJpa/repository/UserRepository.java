package com.foo.hibernateJpa.repository;

import com.foo.hibernateJpa.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
}
