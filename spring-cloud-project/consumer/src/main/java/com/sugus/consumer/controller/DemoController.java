package com.sugus.consumer.controller;

import com.sugus.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/demoConsumer")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Value("${hello.value}")
    private String profileName;

    @RequestMapping(value = "/index")
    public String index(@RequestParam(value = "name", required = false) String name) {
        return demoService.getHello(name + ":" + profileName);
    }

    @RequestMapping("/profileName")
    public String profileName() {
        return profileName;
    }

}
