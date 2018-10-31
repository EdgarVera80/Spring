package com.spring.boot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.model.Bank;
import com.spring.boot.repository.BankRepository;

@Service
public class BankDao {
	
	@Autowired
	private BankRepository bankRepository;
	
	public Bank save(Bank bank) {
		return bankRepository.save(bank);
	}
	
	public List<Bank> findAll(){
		return bankRepository.findAll();
	}
}
