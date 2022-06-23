package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public Greeting index(@RequestParam(name = "id", defaultValue = "1") Integer id, @RequestParam(name = "name", defaultValue = "world") String name) {
        Greeting greeting = new Greeting();
        greeting.setId(id);
        greeting.setContent("Hello, " + name + "!");
        return greeting;
    }
}
