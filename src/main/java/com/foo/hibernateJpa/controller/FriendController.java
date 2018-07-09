package com.foo.hibernateJpa.controller;


import com.foo.hibernateJpa.domain.Friend;
import com.foo.hibernateJpa.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/friend")
public class FriendController {
    @Autowired
    FriendService friendService;

    @PostMapping()
    public Friend saveFriend(@RequestParam("user1") Integer user1, @RequestParam("user2")Integer user2) {
        return friendService.saveFriend(user1, user2);
    }

    @PostMapping("/random")
    public Friend randomFriend() {
        return friendService.randomFriend();
    }
}
