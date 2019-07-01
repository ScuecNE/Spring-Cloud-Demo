package com.sugus.consumer.service.hystrix;

import com.sugus.consumer.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceHystrix implements DemoService {

    @Override
    public String getHello(String name) {
        return "hello fallback!";
    }
}
