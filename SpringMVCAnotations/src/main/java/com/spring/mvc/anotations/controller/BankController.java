package com.spring.mvc.anotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.anotations.model.Bank;


@Controller
@RequestMapping(path="/bank")
public class BankController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String open() {
		return "bank";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(Bank bank,ModelAndView modelAndView) {
		
		System.out.println("Create Bank: " +bank.getName());
		modelAndView.addObject("bank",bank);
		return "success";
	}
}
