package com.mini.dev.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.dev.product.domain.Product;
import com.mini.dev.product.domain.ProductViewAticle;
import com.mini.dev.product.service.ProductService;

@RestController
@RequestMapping("/api")
public class ApiControllerTest {
	
	ProductService productService; 
	
	public ApiControllerTest(ProductService productService) {
		this.productService = productService;
	}
	
	
	@GetMapping("/productList")
	public List<ProductViewAticle> reqProductList(){
		System.out.println("리스트주세요");
		return productService.getProductList();
	}

	@GetMapping("/detail/{id}")
	public Product reqProductDetail(@PathVariable("id") int id) {
		System.out.println("디테일봉죠");
		System.out.println("id = "+ id);
		return productService.getProduct(id);
	}
}
