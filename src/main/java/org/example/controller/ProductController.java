package org.example.controller;

import org.example.entity.Product;
import org.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/product")
    public Product saveProductDetails(@RequestBody Product product){
        return productService.saveProductDetails(product);

    }
}
