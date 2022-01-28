package com.example.authorizationcontrollerspringboot.components;

import com.example.authorizationcontrollerspringboot.authorities.Authorities;
import com.example.authorizationcontrollerspringboot.exceptions.InvalidCredentials;
import com.example.authorizationcontrollerspringboot.exceptions.UnauthorizedUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedUser.class)
    public String newUnauthorizedUserException(UnauthorizedUser e){
        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidCredentials.class)
    public String newInvalidCredentialsException(InvalidCredentials e){
        return e.getMessage();
    }
}