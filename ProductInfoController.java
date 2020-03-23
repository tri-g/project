package com.example.minilogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.minilogin.DAO.ProductInfoDao;
import com.example.minilogin.model.ProductInfo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductInfoController {
	@Autowired
	private ProductInfoDao productInfo;
	
	@GetMapping("/products")
	public List getProducts() {	
	return productInfo.viewAllProducts();
	}
	@GetMapping("/details/{product_id}")
	public List getproductid(@PathVariable(value = "product_id") String id)
	{
		System.out.println(id);
		//System.out.println(name);
		System.out.println("xgfhjbkl");
		return productInfo.viewAllProducts1(id);
	}

	
}