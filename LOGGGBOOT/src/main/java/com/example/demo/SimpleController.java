package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping("/")
	public String home() {
		return "/index.html";

	}

}