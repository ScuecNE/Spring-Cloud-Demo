package com.sugus.consumer.service;

import com.sugus.consumer.service.hystrix.DemoServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(name = "producer", path = "/producer", fallback = DemoServiceHystrix.class)
public interface DemoService {

    @GetMapping("/demoProducer/getHello")
    String getHello(@RequestParam(value = "name", required = false) String name);

}
