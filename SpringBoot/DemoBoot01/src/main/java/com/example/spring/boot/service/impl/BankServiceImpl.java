package com.example.spring.boot.service.impl;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.boot.model.Bank;
import com.example.spring.boot.repository.BankRepository;
import com.example.spring.boot.service.BankService;

import sun.net.ftp.FtpClient.TransferType;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public Bank findById(long id) {
		bankRepository.findById(id);
		return null;
	}

	@Transactional(value=TxType.NEVER)
	@Override
	public Bank findByName(String name) {
		return bankRepository.findByName(name);
	}

	@Override
	public List<Bank> findAllBanks() {
		System.out.println("TOTAL "+bankRepository.count());
		return (List<Bank>) bankRepository.findAll();
	}

}
