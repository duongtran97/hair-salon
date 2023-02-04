package com.duongtv.hair.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.duongtv.hair.repository.CityRepository;

@Controller
public class RegistryController {
    @Autowired
    private CityRepository cityRepository ;
    @GetMapping("/registry")
    public String index(Model model) {
        model.addAttribute("CityList",  cityRepository.findAll());
        return "registry";
    }
    @PostMapping("/registry")
    public String addUser(){
        
        return "home";
    }
}
