package com.hd.ribbon.api;

import com.hd.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonAPI {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient client;

    @GetMapping("/ribbon/{id}")
    public User ribbon(@PathVariable Long id){
        //hd-provider-user  为VIP 虚拟ip，微服务的id
        //负载均衡的体现在，多个统提供者的节点，根据一定的策略，请求不同的节点
        //等ribbon将所有的服务提供者给拉取到后，才会进行负载均衡，如果还没有全部拉取，可能负载均衡不会生效
        return restTemplate.getForObject("http://hd-provider-user/user/"+id,User.class);
    }

    @GetMapping("/test")
    public String test(){

        ServiceInstance instances= client.choose("hd-provider-user");
        System.out.println("==="+instances.getHost()+":"+instances.getServiceId()+":"+instances.getPort());

        ServiceInstance instances= client.choose("hd-provider-user-2");
        System.out.println("###"+instances.getHost()+":"+instances.getServiceId()+":"+instances.getPort());


    }
}
