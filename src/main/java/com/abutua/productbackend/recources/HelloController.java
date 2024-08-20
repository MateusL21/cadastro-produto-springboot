package com.abutua.productbackend.recources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    
    @GetMapping("hello")
    public String getHello(){
        return "Hello Spring Boot";

    }
    
}