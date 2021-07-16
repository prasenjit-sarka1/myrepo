package com.example.githubactionsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

	@GetMapping("/test")
	public String getResponse() {
		return "Welcome!!!";
	}
}
