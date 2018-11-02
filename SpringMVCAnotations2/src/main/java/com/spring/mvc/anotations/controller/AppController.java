package com.spring.mvc.anotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(path="/fc", method=RequestMethod.GET)
	public String display() {
		System.out.println("entra");
		return "inicio";
	}
}
