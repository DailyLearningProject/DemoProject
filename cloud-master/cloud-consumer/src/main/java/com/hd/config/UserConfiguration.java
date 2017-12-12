package com.hd.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration  这个注解不能和ComponentScan中指定的目录为一个级别，否则会将所有的微服务均设置为同一个策略
//如果项目中不配置ComponentScan，那么默认的就是启动类的包为扫描的基本包
@Configuration
public class UserConfiguration {

    @Autowired
    IClientConfig config;

    //指定使用的规则
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
