package com.duongtv.hair.controller;
import com.duongtv.hair.entities.UserFormEntities;
import com.duongtv.hair.repository.*;
import com.duongtv.hair.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.duongtv.hair.entities.UserEntities;

import java.util.Date;
import java.text.ParseException;

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
    @Autowired
    private UserRepository userRepository;

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
    public String addUser(@ModelAttribute UserFormEntities userFormEntities, Model model) throws ParseException {
//        System.out.println(userFormEntities.getDateOfBirth());
        UserEntities userEntities = new UserEntities();
        userEntities.setAdmin(false);
        userEntities.setCodeCity(userFormEntities.getCodeCity());
        userEntities.setCodeDistrict(userFormEntities.getCodeDistrict());
        userEntities.setCodeLand(userFormEntities.getCodeLand());
        userEntities.setCodeVillage(userFormEntities.getCodeVillage());
        userEntities.setDateOfBirth((Date) CommonUtils.convertStringToDate(userFormEntities.getDateOfBirth()));
        userEntities.setEmail(userFormEntities.getEmail());
        userEntities.setFullName(userFormEntities.getFullname());
        userEntities.setHashcode(CommonUtils.createSalt());
        userEntities.setIsDeleted(0);
        userEntities.setPassword(CommonUtils.encodePassword(userFormEntities.getPassword()));
        //        System.out.println(userFormEntities.getDateOfBirth());
//        System.out.println(CommonUtils.convertStringToDate(userFormEntities.getDateOfBirth()));
        userRepository.save(userEntities);
        return "redirect:/login";
    }
}
