package com.foo.hibernateJpa.controller;

import com.foo.hibernateJpa.domain.User;
import com.foo.hibernateJpa.repository.UserRepository;
import com.foo.hibernateJpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/v1/user")
public class MainController {
    @Autowired
    UserService userService;

    @PostMapping()
    public @ResponseBody User addNewUser (@RequestBody User user) {
       return userService.save(user);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userService.findAll();
    }
}

