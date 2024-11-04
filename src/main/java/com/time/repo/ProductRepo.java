package com.time.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.time.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
