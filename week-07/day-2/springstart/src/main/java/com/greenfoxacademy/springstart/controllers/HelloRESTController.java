package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong atomicID = new AtomicLong();

    @RequestMapping(value="/greeting")
    public Greeting greeting (@RequestParam(value = "name", required=false, defaultValue="World") String name) {
        long id = atomicID.getAndIncrement();
        Greeting greetings = new Greeting(id, "Hello, " + name + "!");
        return greetings;
    }

}
