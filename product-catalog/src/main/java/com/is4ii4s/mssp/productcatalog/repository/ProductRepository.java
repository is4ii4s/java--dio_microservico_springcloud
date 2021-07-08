package com.is4ii4s.mssp.productcatalog.repository;

import com.is4ii4s.mssp.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
