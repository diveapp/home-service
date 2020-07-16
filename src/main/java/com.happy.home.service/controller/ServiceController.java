package com.happy.home.service.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lijixiao
 * @date: 2020-07-09
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello/animal")
    public String helloAnimal(){
        List<String> services = discoveryClient.getServices();
        services.forEach(System.out::println);
        return "eureka: hello animal";
    }

    @GetMapping("/hello/user")
    public String helloUser(){
        List<String> services = discoveryClient.getServices();
        services.forEach(System.out::println);
        return "eureka: hello user";
    }
}
