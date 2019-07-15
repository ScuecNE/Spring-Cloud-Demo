package com.sugus.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerFallBackController {

    @GetMapping("/fallback")
    public String fallback() {
        return "oops! fallback! \n from gateway";
    }

}
