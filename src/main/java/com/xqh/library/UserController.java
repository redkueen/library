package com.xqh.library;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/register")
    public boolean register(){
        return true;
    }

    @RequestMapping("/login")
    public User login(){
        return null;
    }

    @RequestMapping("/query")
    public User query(){
        return null;
    }
}
