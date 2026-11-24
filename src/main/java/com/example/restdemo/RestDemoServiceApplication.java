package com.example.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoServiceApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String helloworld(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("hello %s", name);
	}

}
