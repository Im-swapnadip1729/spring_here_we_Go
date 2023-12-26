package com.springboot.rivu.demo01.myFirstJavaApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Coder";
    }

}
