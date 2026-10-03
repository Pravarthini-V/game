package com.game.rockpaperscissor.services;

import com.game.rockpaperscissor.model.user;
import com.game.rockpaperscissor.repo.Userrepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservices {

    @Autowired
    Userrepo userrepo;
    public boolean userlogin(String username){
       return  userrepo.findByName(username).isPresent();
    }
    public void adduser(String username,String password){
        user u=new user();
        u.setName(username);
        u.setPassword(password);
        userrepo.save(u);
    }

}
