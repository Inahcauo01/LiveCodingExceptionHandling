package com.example.demos.service;

import com.example.demos.domain.User;
import com.example.demos.exeption.FahdException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
     User save(User user) throws FahdException;

}
