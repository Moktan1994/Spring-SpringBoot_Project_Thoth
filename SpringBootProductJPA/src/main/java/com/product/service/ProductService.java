package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	
	public Product saveProductInformation(Product product) {
		return productRepository.save(product);
		
	}

	public List<Product> saveProductInformationList(List<Product> product) {
		return productRepository.saveAll(product);
		
	}
	public List<Product> getProduct() {
		return productRepository.findAll();
		
	}
	public Product getProductById(int id) {
		return productRepository.findById(id);
		
	}

}
