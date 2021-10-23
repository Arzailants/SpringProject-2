package com.example.belajar.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // MEMBUAT METHOD GETMAPPING
    @GetMapping("/helloworld")
    public String printHelloWorld(){
        return "Hello World";
    }


    // PATH VARIABLE
    @GetMapping("helloworld/{name}")
    public String printIdName(@PathVariable(value = "name") String name){
        return "Hello " +name;
    }

    // REQUEST PARAM

}
