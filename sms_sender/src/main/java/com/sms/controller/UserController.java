package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.entity.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/submitUser")
	public String UserReg(@ModelAttribute User user) {
		return "index";
	}
}
