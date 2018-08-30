package com.userbank.demo.services;

import com.userbank.demo.dao.models.Bank;
import com.userbank.demo.dao.models.User;
import com.userbank.demo.dao.repository.BankRepository;
import com.userbank.demo.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBankServiceiml implements UserBankSerive{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BankRepository bankRepository;
    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "Them User thanh cong";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Sua User thanh cong";
    }

    @Override
    public String remoteUser(Long id) {
        userRepository.deleteById(id);
        return "Xoa thanh cong";
    }

    @Override
    public List<User> listUser() {
        return userRepository.findAll();
    }

    @Override
    public String addBank(Bank bank) {
        bankRepository.save(bank);
        return "Them Bank thanh cong";
    }

    @Override
    public String updateBank(Bank bank) {
        bankRepository.save(bank);
        return "Sua Bank thanh cong";
    }

    @Override
    public String remoteBank(Long id) {
        bankRepository.deleteById(id);
        return "Xoa Bank thanh cong";
    }

    @Override
    public List<Bank> listBank() {
        return bankRepository.findAll();
    }
}
