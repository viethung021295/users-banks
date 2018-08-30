package com.userbank.demo.controllers;

import com.userbank.demo.dao.models.Bank;
import com.userbank.demo.dao.models.User;
import com.userbank.demo.services.UserBankServiceiml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class UserBankController {
    @Autowired
    private UserBankServiceiml userBankServiceiml;

    @PostMapping(value = "/user")
    public @ResponseBody
    String addUser(@RequestBody User user){
        return userBankServiceiml.addUser(user);
    }

    @PostMapping(value = "/bank")
    public @ResponseBody
    String addBank(@RequestBody Bank bank){
        return userBankServiceiml.addBank(bank);
    }

    @GetMapping(value = "/user")
    public @ResponseBody
    List<User> getUser(){
        return userBankServiceiml.listUser();
    }

    @GetMapping(value = "/bank")
    public @ResponseBody
    List<Bank> getBank(){
        return userBankServiceiml.listBank();
    }

    @PutMapping(value = "/user")
    public @ResponseBody
    String putUser(@RequestBody User user){
        return userBankServiceiml.updateUser(user);
    }

    @PutMapping(value = "/bank")
    public @ResponseBody
    String putBank(@RequestBody Bank bank){
        return userBankServiceiml.updateBank(bank);
    }

    @DeleteMapping(value = "/user/{id}")
    public @ResponseBody
    String delUser(@PathVariable(value = "id") long id){
        return userBankServiceiml.remoteUser(id);
    }

    @DeleteMapping(value = "/bank/{id}")
    public @ResponseBody
    String delBank(@PathVariable(value = "id") long id){
        return userBankServiceiml.remoteBank(id);
    }


}
