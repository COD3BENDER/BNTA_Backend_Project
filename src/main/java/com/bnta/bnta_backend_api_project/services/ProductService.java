package com.bnta.bnta_backend_api_project.services;

import com.bnta.bnta_backend_api_project.models.Product;
import com.bnta.bnta_backend_api_project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllBooks() {
        return productRepository.findByDiscriminatorValue("book");
    }

}
