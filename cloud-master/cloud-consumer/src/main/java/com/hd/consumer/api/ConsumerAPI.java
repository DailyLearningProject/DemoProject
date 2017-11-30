package com.hd.consumer.api;

import com.hd.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerAPI {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/{id}")
    public User findUserById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:7900/user/"+id,User.class);
    }



}
