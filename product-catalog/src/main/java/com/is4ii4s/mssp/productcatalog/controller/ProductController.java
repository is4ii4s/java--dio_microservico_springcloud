package com.is4ii4s.mssp.productcatalog.controller;

import com.is4ii4s.mssp.productcatalog.model.Product;
import com.is4ii4s.mssp.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(method = RequestMethod.POST)
    Product createProduct(@RequestBody Product product) {

        return productService.createProduct(product);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id) {

        return productService.findById(id);
    }

}
