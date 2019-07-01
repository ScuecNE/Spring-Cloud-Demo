package com.sugus.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoProducer")
public class DemoController {

    @GetMapping("/getHello")
    public String getHello(@RequestParam(value = "name", required = false) String name) {
        return "hello!" + name + ".I'm producer";
    }

}
