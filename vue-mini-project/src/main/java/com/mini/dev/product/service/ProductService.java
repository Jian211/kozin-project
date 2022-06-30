package com.mini.dev.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mini.dev.product.dao.ProductDao;
import com.mini.dev.product.domain.Product;
import com.mini.dev.product.domain.ProductViewAticle;

@Service
public class ProductService {

	ProductDao productDao;

	public ProductService (ProductDao productDao) {
		this.productDao = productDao;
	}

	
	/* 여기에 리스트를 가지오는 로직을 구현
	 * 
	 */
	public List<ProductViewAticle> getProductList() {
		// リストを取る
		List<ProductViewAticle> list = null;
		try {
			list = productDao.getProductViewList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("테스트입니다. 리스트 출력");
		System.out.println(list);
		return list;
	}
	
	public Product getProduct(int id) {
		Product product = productDao.getProduct(id);
		return product;
	}
	
}
