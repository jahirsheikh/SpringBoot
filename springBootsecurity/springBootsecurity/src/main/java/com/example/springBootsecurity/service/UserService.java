package com.example.springBootsecurity.service;

import com.example.springBootsecurity.model.User;
import com.example.springBootsecurity.repository.IUserRepo;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private IUserRepo userRepo;

    public boolean isEmailUnique(String email){
        User userEmail= userRepo.findByEmail(email);

        return userEmail== null;
    }



}
