package com.duongtv.hair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.duongtv.hair.repository.UserRepositiry;

@Controller
public class HomeController {
    private UserRepositiry userRepositiry;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/product")
    public String home() {
        return "product";
    }
    @GetMapping("/user")
    public String user() {
        userRepositiry.findAll();

        return "user";
    }
}
