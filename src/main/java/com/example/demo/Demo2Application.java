package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class Demo2Application {
	
	public static Logger logger = LoggerFactory.getLogger(Demo2Application.class);
	
	@PostConstruct
	public void start() {
		logger.info("Post construct invoked");
	}
		
	@GetMapping("/getMsg")
	public String get() {
		return "Jenkins service";
	}
	
	public static void main(String[] args) {
		logger.info("main method executed");
		SpringApplication.run(Demo2Application.class, args);
	}

}
