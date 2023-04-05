package com.duongtv.hair.services;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.repository.UserRepository;
import com.duongtv.hair.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public boolean validateEmail(String email) {
        boolean checkExistEmail = userRepository.existsByEmail(email);
        return  checkExistEmail;
    }
    public boolean validatePassword( String input, String email) throws NoSuchAlgorithmException {
            UserEntities user = userRepository.findByEmail(email);
                List<UserEntities> userEntitiesLst = (List<UserEntities>) userRepository.findAll();
                for (UserEntities userLst:userEntitiesLst) {
                    if(userLst.getEmail().equals(email)){
                        user = userLst;
                        break;
                    }
                }

                return CommonUtils.checkPassword(user.getPassword(),input);
    }
    public boolean checkAdminUser(String email){
        UserEntities user = new UserEntities();
        List<UserEntities> userEntitiesLst = (List<UserEntities>) userRepository.findAll();
        for (UserEntities userLst:userEntitiesLst) {
            if(userLst.getEmail().equals(email)){
                user = userLst;
                break;
            }
        }
        boolean isAdmin = user.isAdmin() ;
        return isAdmin;
    }
}
