package com.example.demos.service.impl;

import com.example.demos.domain.User;
import com.example.demos.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FAHD")
public class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        return User.builder()
                .name("FAHD")
                .age(42)
                .build();
    }
}
