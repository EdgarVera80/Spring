package com.example.spring.boot.service;

import java.util.List;

import com.example.spring.boot.model.Bank;


public interface BankService {
	Bank findById(Integer id);
	Bank findByName(String name);
	List<Bank> findAllBanks();
}
