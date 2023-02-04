package com.duongtv.hair.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class CommonUtils {
    public static byte[] createSalt(String password) {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        // System.out.println(salt.toString());
        return salt;
    }
    public static boolean checkPassword(String password,String input, byte[] salt) throws NoSuchAlgorithmException {
        KeySpec spec = new PBEKeySpec(input.toCharArray(), salt, 66538, 128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        // System.out.println(factory);
        return false;
    }
    // public static void main(String[] args) {
    //    byte[] salt =  createSalt("duong1997");
    // //    String password = "duong1997"
    // try {
    //     checkPassword(null, "duong1997", salt);
    // } catch (NoSuchAlgorithmException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }
    // }
}
