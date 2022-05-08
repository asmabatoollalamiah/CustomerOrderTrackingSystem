package com.pace.cots;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;	

@SpringBootApplication
public class CustomerOrderTrackingSystemApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(CustomerOrderTrackingSystemApplication.class, args);
		System.out.println("end");
	}
	
}
