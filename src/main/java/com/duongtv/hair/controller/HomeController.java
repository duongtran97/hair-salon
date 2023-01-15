package com.duongtv.hair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
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
        return "user";
    }
}
