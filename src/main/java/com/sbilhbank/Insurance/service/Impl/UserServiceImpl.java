package com.sbilhbank.Insurance.service.Impl;

import com.sbilhbank.Insurance.repository.UserRepository;
import com.sbilhbank.Insurance.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
