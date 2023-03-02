package com.duongtv.hair.controller;
import com.duongtv.hair.entities.UserFormEntities;
import com.duongtv.hair.repository.DistrictRepository;
import com.duongtv.hair.repository.LandRepository;
import com.duongtv.hair.repository.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.repository.CityRepository;

@Controller
public class RegistryController {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private VillageRepository villageRepository;
    @Autowired
    private LandRepository landRepository;

    @GetMapping("/registry")
    public String index(Model model) {
        model.addAttribute("CityList", cityRepository.findAll());
        model.addAttribute("DistrictLst",districtRepository.findAll());
        model.addAttribute("VillageLst",villageRepository.findAll());
        model.addAttribute("LandLst",landRepository.findAll());
        model.addAttribute("userFormEntities",new UserFormEntities());
        return "registry";
    }

    @PostMapping("/registry")
    public String addUser(@ModelAttribute UserFormEntities userFormEntities, Model model) {
        System.out.println(userFormEntities.toString());
        System.out.println(userFormEntities.getDateOfBirth());
        UserEntities userEntities = new UserEntities();

        return "redirect:/login";
    }
}
