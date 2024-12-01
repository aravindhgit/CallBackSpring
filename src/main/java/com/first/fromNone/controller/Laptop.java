package com.first.fromNone.controller;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	String company = "GOV";

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
