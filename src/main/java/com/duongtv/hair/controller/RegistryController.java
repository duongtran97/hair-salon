package com.duongtv.hair.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.repository.CityRepository;

@Controller
public class RegistryController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/registry")
    public String index(Model model) {
        model.addAttribute("CityList", cityRepository.findAll());
        return "registry";
    }

    @PostMapping("/registry")
    public String addUser(@ModelAttribute UserEntities userEntities,Model model) {
        // String fullname = userEntities.fullname;
        System.out.println(userEntities.toString());
        // UserEntities user = new UserEntities( null, null, null, null, null, 0, null, null, null, null, null, null, false)
        return "login";
    }
}
