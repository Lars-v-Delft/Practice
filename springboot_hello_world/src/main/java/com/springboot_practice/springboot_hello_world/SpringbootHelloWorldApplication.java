package com.springboot_practice.springboot_hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloWorldApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "test", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
