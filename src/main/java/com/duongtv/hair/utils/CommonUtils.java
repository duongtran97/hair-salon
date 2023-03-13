package com.duongtv.hair.utils;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;



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
    public static boolean checkPassword(String password,String input) throws NoSuchAlgorithmException {
//        String encodeInputWithSalt = encodePassword(input,salt);
        Pbkdf2PasswordEncoder encoder = Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();
//        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder(salt,15,100000,Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        encoder.setEncodeHashAsBase64(true);
        encoder.setAlgorithm(Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        boolean result = encoder.matches(input,password);
        return result;
    }
    public static String encodePassword(String password){
        Pbkdf2PasswordEncoder encoder = Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();
//        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder(salt,15,100000,Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        encoder.setEncodeHashAsBase64(true);
        encoder.setAlgorithm(Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        String passwordEncode = encoder.encode(password);
        return passwordEncode;
    }
    public static Date convertStringToDate(String input) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate ;
        if(input.isEmpty()){
            input = "1997-01-31";
        }
        startDate =  df.parse(input);
        return startDate;
    }
//    public static String createBillCode(){
//
//    }
//     public static void main(String[] args) {
//         try {
//             String salt = createSalt();
//             String passEncode = encodePassword("duong1997",salt);
//             System.out.println(passEncode);
//             System.out.println(salt);
//             System.out.println(checkPassword(passEncode,"duong1997",salt));
//         } catch (NoSuchAlgorithmException e) {
//             throw new RuntimeException(e);
//         }
//     }
}
