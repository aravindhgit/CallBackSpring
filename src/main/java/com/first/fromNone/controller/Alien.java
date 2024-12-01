package com.first.fromNone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Alien {
	
	@Autowired
	public Laptop lap;
	
	@GetMapping("/alien")
	public String getAlien() {
		System.out.println("INSIDE getAlien");
		return "redirect:https://www.google.com"; 
	}
	
	@GetMapping("/lap")
	public void getLap() {		
		System.out.println("INSIDE /lap getLap();"+lap.getCompany());
	}
	

}
