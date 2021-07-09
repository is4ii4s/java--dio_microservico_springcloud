package com.is4ii4s.mssp.productcatalog.service;

import com.is4ii4s.mssp.productcatalog.model.Product;
import com.is4ii4s.mssp.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {

        return productRepository.save(product);
    }


    public Optional<Product> findById(Integer id) {

        return productRepository.findById(id);
    }

}
