package com.anudip.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello SpringBoot App";
	}
}
