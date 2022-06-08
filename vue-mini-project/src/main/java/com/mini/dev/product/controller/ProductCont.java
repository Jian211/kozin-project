package com.mini.dev.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mini.dev.product.domain.Product;
import com.mini.dev.product.mapper.ProductMapper;

@Controller
public class ProductCont {
	
	ProductMapper mapper;
	
	public ProductCont( ProductMapper mapper ) {
		this.mapper = mapper;
	}
	
	
	@GetMapping("/create")
	public String test() {
		String email = "testSuccess";
		Product product = mapper.getProduct(email);
		System.out.println("product 출력 물론 유저지만 그냥 테스트 " + product );
		
		return "index.html ";
	}
	
}
