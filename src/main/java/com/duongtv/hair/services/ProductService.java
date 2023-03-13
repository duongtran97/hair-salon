package com.duongtv.hair.services;

import com.duongtv.hair.entities.ProductEntities;
import com.duongtv.hair.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<ProductEntities> getAllProduct(){
        return (List<ProductEntities>) productRepository.findAll();
    }
}
