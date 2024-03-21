package com.role.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.role.login.repository.UsersRepository;
import com.role.login.entity.Users;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @SuppressWarnings("null")
    public Users getUserById(Long userId) {
        return usersRepository.findById(userId)
                              .orElse(null); // or throw an exception if needed
    }

    @SuppressWarnings("null")
    public Users saveUsers(Users users){
        return usersRepository.save(users);
    }
}
