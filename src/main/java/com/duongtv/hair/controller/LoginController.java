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
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public String index(Model model) {
        model.addAttribute("userEntities",new UserFormEntities());
        return "login";
    }
    @PostMapping("/login")
    public String index(@ModelAttribute UserEntities userEntities,Model model) throws Exception {
//        UserService userService = new UserService();
        String email = userEntities.getEmail().trim();
        String inputPassword = userEntities.getPassword().trim();

        if(email.isEmpty() || inputPassword.isEmpty()){
            model.addAttribute("message","Nhập thiếu email và password!");
            model.addAttribute("userEntities",userEntities);
            return "login";
        }else {

            boolean check = userService.validateEmail(email);
            if(!check){
                model.addAttribute("message", "Không tồn tại user có địa chỉ mail này /n Nhập email đúng!");
                model.addAttribute("userEntities", userEntities);
                return "login";

            }else{
                check = userService.validatePassword(inputPassword,email);
                if(check){
                    return "redirect:/product";
                }else {
                    model.addAttribute("message", "Sai mật khẩu hoặc password!");
                    model.addAttribute("userEntities", userEntities);
                    return "login";
                }

            }

        }


    }
}
