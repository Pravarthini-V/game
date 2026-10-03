package com.game.rockpaperscissor.controller;

import com.game.rockpaperscissor.model.user;
import com.game.rockpaperscissor.services.userservices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class usercontroller {
    @Autowired
    userservices userservice;
    @PostMapping("/existinguse")
    public boolean checkuser(@RequestBody user u){
        String username=u.getName();
        return userservice.userlogin(username);
    }
    @PostMapping("/adduser")
    public void adduser(@RequestBody user u){
        userservice.adduser(u.getName(),u.getPassword());
    }
}
