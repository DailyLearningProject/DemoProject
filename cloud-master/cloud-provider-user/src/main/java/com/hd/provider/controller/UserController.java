package com.hd.provider.controller;

import com.hd.provider.dao.UserDao;
import com.hd.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDao dao;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return dao.findOne(id);
    }


}
