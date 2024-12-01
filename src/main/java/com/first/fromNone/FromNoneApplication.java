package com.first.fromNone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.first.fromNone.controller.Alien;
import com.first.fromNone.controller.CallBackController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.first.fromNone", "service"})  // Ensure 'service' package is scanned
//@EnableAsync
public class FromNoneApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext ac = 
		SpringApplication.run(FromNoneApplication.class, args);
//		Alien al = ac.getBean(Alien.class);
//		al.getAlien();
		
//		CallBackController a2 = ac.getBean(CallBackController.class);
//
//		a2.handleCallback(null);
//		
	}

}
