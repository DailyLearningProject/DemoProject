package com.hd.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerApplication {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(ConsumerApplication.class,args);
    }

}
