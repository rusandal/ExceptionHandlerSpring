package com.example.authorizationcontrollerspringboot.components;

import com.example.authorizationcontrollerspringboot.authorities.Authorities;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        return (user.equals("Vasya") & password.equals("pass")) ? List.of(Authorities.READ, Authorities.WRITE) : null;
        }
}
