package com.duongtv.hair.controller;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.entities.UserFormEntities;
import com.duongtv.hair.repository.UserRepository;
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
    private UserRepository userRepository;
    @GetMapping("/login")
    public String index(Model model) {
        model.addAttribute("userEntities",new UserFormEntities());
        return "login";
    }
    @PostMapping("/login")
    public String index(@ModelAttribute UserEntities userEntities,Model model) throws NoSuchAlgorithmException {
//        UserService userService = new UserService();
        String email = userEntities.getEmail().trim();
        System.out.println(email);
        UserEntities user = new UserEntities();

        boolean checkExistEmail = userRepository.existsByEmail(email);

        if(checkExistEmail) {
            boolean check = true;
            List<UserEntities> userEntitiesLst = (List<UserEntities>) userRepository.findAll();
            for (UserEntities userLst:userEntitiesLst) {
                if(userLst.getEmail().equals(userEntities.getEmail())){
                    user = userLst;
                    break;
                }
            }
            String password = user.getPassword().trim();
            System.out.println(password);
            String input = userEntities.getPassword();
            check = CommonUtils.checkPassword(password,input);
            if (check){
                return "redirect:/product";
            } else {
                model.addAttribute("message","Nhập sai email hoặc password!");
                model.addAttribute("userEntities",userEntities);
                return "login";
            }
        }else{
            model.addAttribute("message", "Không tồn tại user có địa chỉ mail này!");
            model.addAttribute("userEntities", userEntities);
            return "login";

        }

    }
}
