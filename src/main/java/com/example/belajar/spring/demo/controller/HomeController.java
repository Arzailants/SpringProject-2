package com.example.belajar.spring.demo.controller;

import com.example.belajar.spring.demo.entity.Todo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class HomeController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("todo/get")
    public String getTodo(){
        String result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", String.class);
        return result;
    }


    @GetMapping("todo/post")
    public String postTodo(){
        HttpHeaders header = new HttpHeaders();
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        // INSTANSIASI OBJEK TODO
        Todo newTodo = new Todo();
        newTodo.setId((long) 999);
        newTodo.setTitle("Andre");
        newTodo.setUserId((long) 10);
        newTodo.setCompleted(false);

        HttpEntity<Todo> entity = new HttpEntity<>(newTodo, header);

        return restTemplate.exchange("https://jsonplaceholder.typicode.com/todos", HttpMethod.POST, entity, String.class).getBody();

    }

    // MEMBUAT METHOD GETMAPPING
//    @GetMapping("/helloworld")
//    public String printHelloWorld(){
//        return "Hello World";
//    }
//
//
//    // PATH VARIABLE
//    @GetMapping("helloworld/{name}")
//    public String printIdName(@PathVariable(value = "name") String name){
//        return "Hello " +name;
//    }
//
//    // REQUEST PARAM
//    @PostMapping("/helloworld")
//    public String helloWorldPostController(@RequestParam(name = "UserName") String username){
//        return "Hello " +username;
//    }
//
//
//    // REQUEST BODY
//    @PostMapping("/HelloWorldUser")
//    public UserName helloWorldRequestBody(@Valid @RequestBody UserName userName){
//        return userName;
//    }
}
