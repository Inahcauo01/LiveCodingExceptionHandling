package com.example.demos.service.impl;

import com.example.demos.domain.User;
import com.example.demos.exeption.FahdException;
import com.example.demos.repository.UserRepository;
import com.example.demos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
@Qualifier("ABDELGHAFOUR")
public class UserServiceImpl2 implements UserService {
    private final UserRepository userRepository;


    @Override
    public User save(User user) throws FahdException {
        Map<Integer, String> errors = new HashMap<>();
        if (user.getAge() < 0){
            errors.put(1,"Age must be positive");
        }

        if (user.getName().startsWith("a")){
            errors.put(2, "Name must not start with the character a");
        }

        if (!errors.isEmpty()){
            throw new FahdException(errors);
        }
        return userRepository.save(user);
    }
}
