package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String sayHello(){
        return "<h1>Hello!!! Welcome to my page.......,</h1>";
    }
    @GetMapping("/bye")
    public String sayGoodBye(){
        return "<h1>Good Bye!!!!!</h1>";
    }
}
