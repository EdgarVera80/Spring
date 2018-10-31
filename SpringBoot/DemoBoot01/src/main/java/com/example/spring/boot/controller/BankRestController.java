package com.example.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.boot.model.Bank;
import com.example.spring.boot.service.BankService;

@RestController
public class BankRestController {
	
	@Autowired
	private BankService bankService;
	
	@RequestMapping(value="/banks", method=RequestMethod.GET)
	public ResponseEntity<List<Bank>> listAllBanks(){
		List<Bank> banks=bankService.findAllBanks();
		if(banks.isEmpty()) {
			System.out.println("No Bank was found!");
			return new ResponseEntity<List<Bank>>(HttpStatus.NO_CONTENT);
		}
		System.out.println("Total Banks: " + banks.size());
		return new ResponseEntity<List<Bank>>(banks,HttpStatus.OK);
	}
}
