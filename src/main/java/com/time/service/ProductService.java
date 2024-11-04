package com.time.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.entity.Product;
import com.time.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
	public void saveProduct()
	{
		Product p=new Product();
		
	
		p.setName("computer");
		p.setPrice(7000.0);
		repo.save(p);
		
		System.out.println("product saved");
	}

}
