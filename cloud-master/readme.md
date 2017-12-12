# 系统说明
## 版本V0.0.1
    本项目主要是作为微服务的入门演示，包含有服务的注册和调用，以及注册中心的服务器注册和客户端注册；

- cloud-consumer 为消费者
   使用硬编码进行调用服务提供者接口
- cloind-provider-user 为服务提供者
    使用h2作为数据库操作
    使用springboot提供了一个简单的接口
- hd-eureka-server 为注册中心服务端
    开启了一个单机的注册中心服务

> @EnableEurekaServer Eureka的服务端注解
> @EnableEurekaClient Eureka的客户端注解

## 版本V0.0.2
- 添加了eureka服务，以及客户端的注册
- 简单使用了ribbon的策略，以及为不同的服务分别指定不同的策略
