package com.example.demos.web.rest;

import com.example.demos.domain.User;
import com.example.demos.exeption.FahdException;
import com.example.demos.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")

public class UserRest {
    private final UserService userService;

    public UserRest(@Qualifier("ABDELGHAFOUR") UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> save(@Valid @RequestBody User user) throws FahdException {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

}
