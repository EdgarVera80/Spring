package com.spring.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.dao.BankDao;
import com.spring.boot.model.Bank;

@RestController
@RequestMapping("/company")
public class BankController {
	
	@Autowired
	private BankDao bankDao;
	
	@PostMapping("/create")
	public Bank createBank(@Valid @RequestBody Bank bank){
		System.out.println("SAVE......");
		return bankDao.save(bank);
	}
	
	@PostMapping("/banks")
	public ResponseEntity<List<Bank>> getAllBanks(){
		System.out.println("OK");
		List<Bank> banks =bankDao.findAll();
		System.out.println("Total: " + banks.size());
		if(banks.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(banks);
	}
	
}
