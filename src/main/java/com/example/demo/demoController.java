package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class demoController {
	@GetMapping("/getGreeting")
	public String getGreeting() {
		return "Hey, Welcome to the demo project";
	}

}
