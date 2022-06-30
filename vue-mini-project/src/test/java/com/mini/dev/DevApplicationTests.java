package com.mini.dev;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mini.dev.product.domain.Product;
import com.mini.dev.product.service.ProductService;

@SpringBootTest
class DevApplicationTests {

	@Autowired
	ProductService productService; 
	
	@Test
	void contextLoads() {
		Product testProduct1 = productService.getProduct(2);
		System.out.println(testProduct1);
	}

}
