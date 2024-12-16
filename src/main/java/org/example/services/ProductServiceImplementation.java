package org.example.services;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product saveProductDetails(Product product) {
     return productRepository.save(product) ;
    }
}
