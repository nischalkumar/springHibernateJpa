package com.foo.hibernateJpa.controller;

import com.foo.hibernateJpa.domain.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
@RequestMapping("/v1/greeting")
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    @RequestMapping("")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
