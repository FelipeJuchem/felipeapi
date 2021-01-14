package com.felipe.api.resource;

import com.felipe.api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping()
    public User findAll() {
        User u = new User(1L, "Maria", "maria@gmail", "2123123123", "jarapicu23" );
        return u;
    }





}
