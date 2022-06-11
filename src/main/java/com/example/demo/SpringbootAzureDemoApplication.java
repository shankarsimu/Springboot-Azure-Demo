package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureDemoApplication {

	@GetMapping("/msg")
	public String getMsg() {
		return "Holà !! Your App is Live In Azure Platform !!!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureDemoApplication.class, args);
	}

}
