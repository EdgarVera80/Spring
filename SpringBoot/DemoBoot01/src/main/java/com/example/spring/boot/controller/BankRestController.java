package com.example.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.boot.model.Bank;
import com.example.spring.boot.service.BankService;

@RestController
public class BankRestController {
	
	@Autowired
	private BankService bankService;
	
	@RequestMapping(value="/services/banks", method=RequestMethod.GET)
	public ResponseEntity<List<Bank>> listAllBanks(){
		List<Bank> banks=bankService.findAllBanks();
		if(banks.isEmpty()) {
			return new ResponseEntity<List<Bank>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Bank>>(banks,HttpStatus.OK);
	}
	
	@GetMapping(value="/services/bank/{id}") //Otra forma de Get
	public ResponseEntity<Bank> getBankById(@PathVariable("id") Integer bankId){
		Bank bank=bankService.findById(bankId);
		if(bank==null) {
			return new ResponseEntity<Bank>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Bank>(bank,HttpStatus.OK);
	}
}
