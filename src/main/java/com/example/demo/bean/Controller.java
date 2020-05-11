package com.example.demo.bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(value="/greetings")
	public String greeting() {
		return "Greeting";
	}
	
}
