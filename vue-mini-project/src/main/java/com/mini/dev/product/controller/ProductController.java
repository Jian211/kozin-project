package com.mini.dev.product.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mini.dev.product.dao.ProductDao;

@Controller
public class ProductController {
	
	ProductDao mapper;
	
	public ProductController( ProductDao mapper ) {
		this.mapper = mapper;
	}
	
	
	@GetMapping("/")
	public String test3() {
		System.out.println("home 입니다.");
		return "index.html ";
	}

	@GetMapping("/detail")
	public String test2() {
		System.out.println("detail 입니다.");
		return "index.html ";
	}

	@GetMapping("/create")
	public String test() {
		System.out.println("create 입니다.");
		return "index.html ";
	}
	
	// api 실험 
	
}
