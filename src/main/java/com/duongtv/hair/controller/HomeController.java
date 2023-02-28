package com.duongtv.hair.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.duongtv.hair.repository.UserRepository;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/product")
    public String home() {
        return "product";
    }
    @GetMapping("/user")
    public String user(Model model) {
        try {
            // userRepositiry.findAll();
            model.addAttribute("UserList", userRepository.findAll());
            // userRepository.findAll().forEach(System.out::println);
//            userRepository.findByFullname("duong").forEach(System.out::println);
            return "user";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return "user";
    }
}
