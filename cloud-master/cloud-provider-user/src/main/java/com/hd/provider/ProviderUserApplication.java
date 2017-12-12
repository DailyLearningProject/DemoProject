package com.hd.provider;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.CloudEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan("com.hd.provider")
@SpringBootApplication
@EnableEurekaClient//@EnableDiscoveryClient
public class ProviderUserApplication {

    //在run config中新启动一个这个类的启动类，然后修改yml中的端口，再次启动一个这个服务
    //在使用restTemplate进行多次调用的时候，可以看到日志分别打印在两个不同服务的控制台，即实现了负载均衡
    public static void main(String[] args){
        SpringApplication.run(ProviderUserApplication.class,args);
    }

}
