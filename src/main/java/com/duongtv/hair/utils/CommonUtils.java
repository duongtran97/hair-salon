package com.duongtv.hair.utils;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Random;

import javax.crypto.spec.PBEKeySpec;


public class CommonUtils {
    public static String createSalt() {
        Random random = new Random();
        StringBuilder salt = new StringBuilder();
        int i = 1;
        char charAscii = (char) random.nextInt(33,126);
        while(i<16){

            salt.append(charAscii);
            charAscii = (char) random.nextInt(33,126);
            i++;

        }

        return salt.toString();
    }
    public static boolean checkPassword(String password,String input, String salt) throws NoSuchAlgorithmException {
//        String encodeInputWithSalt = encodePassword(input,salt);

        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder(salt,15,100000,Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        encoder.setEncodeHashAsBase64(true);
        boolean result = encoder.matches(input,password);
        return result;
    }
    public static String encodePassword(String password, String salt){
//        Pbkdf2PasswordEncoder encoder = Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();
        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder(salt,15,100000,Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        encoder.setEncodeHashAsBase64(true);
        String passwordEncode = encoder.encode(password);
        return passwordEncode;
    }
     public static void main(String[] args) {
//         System.out.println(encodePassword("duong1997","sj7pf#4tpYh+Wo$"));
         try {
             System.out.println(encodePassword("duong1997","sj7pf#4tpYh+Wo$"));
             System.out.println(checkPassword("8iTMlc447/CDZuLY127cMvUES1Rhvq3S2lDUVjUAuD8ssewt1FGzL4RGyMkdLCA=","duong197","sj7pf#4tpYh+Wo$"));
         } catch (NoSuchAlgorithmException e) {
             throw new RuntimeException(e);
         }
     }
}
