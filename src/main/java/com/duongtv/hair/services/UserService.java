package com.duongtv.hair.services;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.repository.UserRepository;
import com.duongtv.hair.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;


public class UserService {
    @Autowired
    private UserRepository userRepository;
    public boolean validatePassword( UserEntities userForm) throws NoSuchAlgorithmException {
        String email = userForm.getEmail();
        UserEntities userEntities = userRepository.findByEmail(email);
        if(userRepository == null){
            return false;
        }
        boolean checkPassword = false;
        String salt = userEntities.getHashcode();
        String password = userEntities.getPassword();
        String input = userForm.getPassword();
        checkPassword = CommonUtils.checkPassword(password,input);
        return checkPassword;
    }
}
