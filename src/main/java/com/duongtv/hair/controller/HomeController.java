package com.duongtv.hair.controller;

import com.duongtv.hair.entities.ProductEntities;
import com.duongtv.hair.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.duongtv.hair.repository.UserRepository;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/homepage")
    public String home() {
        return "user/shop";
    }
    @GetMapping("/homepage")
    public String getProduct(Model model){
        List<ProductEntities> productEntitiesLst = productService.getAllProduct();
        model.addAttribute("productEntitiesLst",productEntitiesLst);
        return "user/shop";
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
    @GetMapping("/dashboard")
    public String dashboard(Model model){
        return "admin/index";
    }
}
