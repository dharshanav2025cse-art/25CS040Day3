package com.example.banking.service;

import com.example.banking.model.User;
import com.example.banking.repository.BankRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private BankRepo bankRepo;

    public List<User> getAllUsers() {
        return bankRepo.findAll();
    }

    public void addUser(User user) {
        bankRepo.save(user);
    }

    public void replaceUser(int userid, User newUser) {
        newUser.setUserid(userid);
        bankRepo.save(newUser);
    }

    public void removeUser(int userid) {
        bankRepo.deleteById(userid);
    }
}