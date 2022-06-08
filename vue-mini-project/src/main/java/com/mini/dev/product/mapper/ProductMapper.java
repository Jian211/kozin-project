package com.mini.dev.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mini.dev.product.domain.Product;

@Mapper
public interface ProductMapper {
	
	@Select("select * from t_user where email='${email}'")
	Product getProduct(@Param("email")String email);
	
}
