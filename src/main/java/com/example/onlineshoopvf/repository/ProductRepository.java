package com.example.onlineshoopvf.repository;

import com.example.onlineshoopvf.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
