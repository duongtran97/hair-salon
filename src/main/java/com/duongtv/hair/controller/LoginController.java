package com.duongtv.hair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String index() {
        return "login";
    }
    @PostMapping("/login")
    public String index(String username,String password) {
        boolean check = true;
        if (check){
            return "redirect:/user";
        }
        return "login";
    }
}
