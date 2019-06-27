package com.sugus.consumer.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sugus.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getHelloError")
    public String getHello(String name) {
        return restTemplate.getForObject("http://producer/producer/demoProducer/index?name={name}", String.class, name);
    }

    public String getHelloError(String name) {
        return "This name:'" + name + "' client has some error!";
    }
}
