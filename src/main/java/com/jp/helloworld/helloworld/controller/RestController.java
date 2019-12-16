package com.jp.helloworld.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World Jay!!!";
    }
}
