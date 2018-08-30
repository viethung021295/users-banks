package com.userbank.demo.services;

import com.userbank.demo.dao.models.Bank;
import com.userbank.demo.dao.models.User;

import java.util.List;

public interface UserBankSerive {
    String addUser(User user);
    String updateUser(User user);
    String remoteUser(Long id);
    List<User> listUser();
    String addBank(Bank bank);
    String updateBank(Bank bank);
    String remoteBank(Long id);
    List<Bank> listBank();
}
