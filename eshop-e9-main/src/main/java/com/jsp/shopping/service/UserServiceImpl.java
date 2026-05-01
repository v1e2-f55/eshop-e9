package com.jsp.shopping.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.shopping.dao.ProductDao;
import com.jsp.shopping.entity.Product;
import com.jsp.shopping.mapper.MyMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private MyMapper mapper;

	@Autowired
	private ProductDao productDao;

	@Override
	public Map<String, Object> getProducts(int page, int size, String sort, boolean desc, String name, String category,
			double lower, double higher) {
		List<Product> products = productDao.getProducts(page, size, sort, desc, name, category, lower, higher);
		return Map.of("message", "Products Found", "products", mapper.toProductDtoList(products));
	}
}