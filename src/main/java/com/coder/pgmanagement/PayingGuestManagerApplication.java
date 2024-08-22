package com.coder.pgmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayingGuestManagerApplication {

	public static void main(String[] args) {
		System.out.print("HeyPaying guest Application");	
		SpringApplication.run(PayingGuestManagerApplication.class, args);
	}

}
