package com.example.authorizationcontrollerspringboot;

import com.example.authorizationcontrollerspringboot.authorities.Authorities;
import com.example.authorizationcontrollerspringboot.components.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import static com.example.authorizationcontrollerspringboot.authorities.Authorities.READ;
import static com.example.authorizationcontrollerspringboot.authorities.Authorities.WRITE;

@SpringBootApplication
public class AuthorizationControllerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationControllerSpringBootApplication.class, args);
    }
}
