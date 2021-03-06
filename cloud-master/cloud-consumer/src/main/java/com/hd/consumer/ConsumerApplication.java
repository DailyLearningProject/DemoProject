package com.hd.consumer;

import com.hd.config.UserConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//name 是eureka中注册的名称
//RibbonClient  注解表示spring-boot-consumer这个服务，使用的ribbon策略是UserConfiguration这个类中定义指定的
//RibbonClient 为某个微服务指定ribbon策略
@RibbonClient(name = "spring-boot-consumer",configuration = UserConfiguration.class)
public class ConsumerApplication {


    @Bean
    @LoadBalanced  //让RestTemplate具备ribbon的负载均衡能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(ConsumerApplication.class,args);
    }

}
