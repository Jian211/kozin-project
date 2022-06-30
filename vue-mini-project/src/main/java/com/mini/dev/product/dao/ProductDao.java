package com.mini.dev.product.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mini.dev.product.domain.Product;
import com.mini.dev.product.domain.ProductViewAticle;

@Mapper
public interface ProductDao {
	
//	@Select("select * from t_user where email='${email}'")
	Product getProduct(@Param("id") int id);

//	@Select("SELECT * FROM dev.t_product")
	ArrayList<Product> getProductList();

	ArrayList<ProductViewAticle> getProductViewList() throws Exception;
	
}
