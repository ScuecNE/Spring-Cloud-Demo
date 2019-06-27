package com.sugus.consumer.controller;

import com.sugus.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demoConsumer")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/index")
    public String remote(@RequestParam(value = "name", required = false) String name) {
        return demoService.getHello(name);
    }

}
