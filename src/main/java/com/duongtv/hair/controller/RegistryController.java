package com.duongtv.hair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistryController {
    @GetMapping("/registry")
    public String index() {
        
        return "registry";
    }
}
