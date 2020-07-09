package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyContoller {
	
	@GetMapping("/hello1")
	public String gethello() {
		return "God Goodess are good";
	}

}
