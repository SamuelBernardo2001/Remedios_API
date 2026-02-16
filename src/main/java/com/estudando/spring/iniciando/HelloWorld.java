package com.estudando.spring.iniciando;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/world")
    public String hello(){
        return "Hello World";
    }
}
