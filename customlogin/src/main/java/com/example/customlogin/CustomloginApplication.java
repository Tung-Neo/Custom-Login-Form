package com.example.customlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class CustomloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomloginApplication.class, args);
    }

    @GetMapping("/users")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World")String name){
        return String.format("Users Hello %s!", name);
    }

    @GetMapping("/admin")
    public String sayAdmin(@RequestParam(value = "myName", defaultValue = "World")String name){
        return String.format("Admin Hello %s!", name);
    }
}
