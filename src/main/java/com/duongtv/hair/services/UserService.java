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
            UserEntities user = new UserEntities();
                boolean check = true;
                List<UserEntities> userEntitiesLst = (List<UserEntities>) userRepository.findAll();
                for (UserEntities userLst:userEntitiesLst) {
                    if(userLst.getEmail().equals(email)){
                        user = userLst;
                        break;
                    }
                }
                check = CommonUtils.checkPassword(user.getPassword(),input);

                return check;
    }
}
