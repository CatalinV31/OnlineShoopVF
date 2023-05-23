package com.example.onlineshoopvf.service;

import com.example.onlineshoopvf.model.Product;
import com.example.onlineshoopvf.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {

        return productRepository.findAll();
    }
}
