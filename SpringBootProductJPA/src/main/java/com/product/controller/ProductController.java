package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController

public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProductInformation(product);
	}


	@PostMapping("/addProductList")
	public List<Product> saveProductList(@RequestBody List<Product> product) {
		return productService.saveProductInformationList(product);
	}
	
	@GetMapping("/getProduct")
	public List<Product> getProduct() {
		return productService.getProduct();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
}
