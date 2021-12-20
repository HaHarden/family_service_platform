package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@RestController == @Controller+@ResponseBody
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {})
public class TestController {

    @RequestMapping("/auth/login")
    public String test() {
        System.out.println("test");
        return "";
    }
}

