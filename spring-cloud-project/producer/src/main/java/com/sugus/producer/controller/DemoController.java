package com.sugus.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demoProducer")
public class DemoController {

    @RequestMapping(value = "/index")
    public String index(@RequestParam(name = "name", required = false) String name) {
        return "hello!" + name + ".I'm producer";
    }

}
