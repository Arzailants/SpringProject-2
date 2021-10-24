package com.example.belajar.spring.demo.controller;

import com.example.belajar.spring.demo.entity.UserName;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/helloworld")
    public String helloWorldPostController(@RequestParam(name = "UserName") String username){
        return "Hello " +username;
    }


    // REQUEST BODY
    @PostMapping("/HelloWorldUser")
    public UserName helloWorldRequestBody(@RequestBody UserName userName){
        return userName;
    }
}
