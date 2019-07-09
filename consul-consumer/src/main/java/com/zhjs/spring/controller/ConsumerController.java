package com.zhjs.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConsumerController
 * @author: zhjs
 * @createDate: 2019/7/2 下午3:55
 * @JDK: 1.8
 * @Desc: TODO
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/services")
    public Object services(){
        return discoveryClient.getInstances("service-producer");
    }

    @RequestMapping("/discover")
    public Object discover(){
        return loadBalancerClient.choose("service-producer").getUri().toString();
    }

    @RequestMapping("/call")
    public String call(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-producer");
        return new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/producer/hello",String.class);
    }
}
