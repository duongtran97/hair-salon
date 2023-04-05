package com.duongtv.hair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminSystemController {
    @GetMapping("/admin/add/product")
    public String addProduct(Model model){
        return "admin/product";
    }
    @GetMapping("/admin/add/user")
    public String addNewUser(Model model){
        return "admin/user";
    }
}
