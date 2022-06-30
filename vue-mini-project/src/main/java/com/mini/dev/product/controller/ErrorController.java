package com.mini.dev.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController{

	@GetMapping("/error")
	public String redirectRoot() {
		System.out.println("에러발생!!");
		return "index.html";
	}
	
	
}
