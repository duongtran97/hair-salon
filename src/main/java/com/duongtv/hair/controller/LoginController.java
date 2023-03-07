package com.duongtv.hair.controller;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.entities.UserFormEntities;
import com.duongtv.hair.repository.UserRepository;
import com.duongtv.hair.services.UserService;
import com.duongtv.hair.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.NoSuchAlgorithmException;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/login")
    public String index(Model model) {
        model.addAttribute("userEntities",new UserFormEntities());
        return "login";
    }
    @PostMapping("/login")
    public String index(@ModelAttribute UserEntities userEntities,Model model) throws NoSuchAlgorithmException {
//        UserService userService = new UserService();
        String email = userEntities.getEmail();
        UserEntities user = userRepository.findByEmail(email);
        boolean check = true;
        if(user == null){
            check = false;
        }
        String salt = userEntities.getHashcode();
        String password = userEntities.getPassword();
        String input = userEntities.getPassword();
        check = CommonUtils.checkPassword(password,input,salt);
        if (check){
            return "redirect:/product";
        } else {
            model.addAttribute("message","Nhập sai email hoặc password!");
            model.addAttribute("userEntities",userEntities);
            return "login";
        }
    }
}
