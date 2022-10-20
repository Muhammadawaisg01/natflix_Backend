package com.spring.firstproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class FirstspringprojectApplication {
	@Value("${server.port:8082}")
	public static void main(String[] args) {
		SpringApplication.run(FirstspringprojectApplication.class, args);
	}
	
//	@RequestMapping(value="/EEE")
//	public String hello() {
//	return "<h1>Hello World from Tom</h1>";
//	}
//	@RequestMapping(value="/EEE1")
//	public String hello1() {
//	return "<h1>Hello World from Tom</h1>";
//	}

}
