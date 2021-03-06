package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

		@RequestMapping(value="/hello", method=RequestMethod.GET)
		public String hello(@RequestParam(value="name",required=false) String name, Model model) {
			System.out.println("NAME: "+name);
			model.addAttribute("name",name);
			return "hello";
		}
}
