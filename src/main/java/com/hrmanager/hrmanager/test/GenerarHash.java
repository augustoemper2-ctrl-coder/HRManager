package com.hrmanager.hrmanager.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerarHash {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = "123456";  // contraseña simple para prueba
        String hash = encoder.encode(password);
        System.out.println(hash);
    }
}
