package com.example.hw11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome! determine path to display info.";
    }

    @GetMapping(path = "/name")
    public String name(){
        return "My name is Razan Alanazi";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "My age is 23";
    }

    @GetMapping(path = "/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping(path = "/names")
    public String[] names(){
        return new String[]{"Razan", "Arwa", "Shatha", "Lujain","Durar"};
    }
}
