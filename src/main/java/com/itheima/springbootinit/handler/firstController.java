package com.itheima.springbootinit.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class firstController {
    @RequestMapping("/first")
    public String first(){
        return "this is my first learning springboot in itheima";
    }
}
