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
    public static boolean checkPassword(String password,String input, String salt) throws NoSuchAlgorithmException {
//        String encodeInputWithSalt = encodePassword(input,salt);

        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder(salt,15,100000,Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        encoder.setEncodeHashAsBase64(true);
        boolean result = encoder.matches(input+salt,password);
        return result;
    }
    public static String encodePassword(String password, String salt){
//        Pbkdf2PasswordEncoder encoder = Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();
        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder(salt,15,100000,Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        encoder.setEncodeHashAsBase64(true);
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
//     public static void main(String[] args) {
//         try {
//             System.out.println(convertStringToDate("2023-03-28"));
//         } catch (ParseException e) {
//             throw new RuntimeException(e);
//         }
//         try {
//             System.out.println(encodePassword("duong1997","sj7pf#4tpYh+Wo$"));
//             System.out.println(createSalt());
//             System.out.println(checkPassword("8iTMlc447/CDZuLY127cMvUES1Rhvq3S2lDUVjUAuD8ssewt1FGzL4RGyMkdLCA=","duong1997","sj7pf#4tpYh+Wo$"));
//         } catch (NoSuchAlgorithmException e) {
//             throw new RuntimeException(e);
//         }
//     }
}
