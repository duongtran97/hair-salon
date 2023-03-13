package com.duongtv.hair.services;

import com.duongtv.hair.entities.CartEntities;
import com.duongtv.hair.entities.ProductEntities;
import com.duongtv.hair.repository.CartRepository;
import com.duongtv.hair.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;
    public void addProductToCart(String id)throws Exception{
        Long autoId = Long.valueOf(id);
        Optional<ProductEntities> product = productRepository.findById(autoId);
        CartEntities cartEntities = new CartEntities();
        cartEntities.setCodeOfProduct(product.get().getCode());
        cartEntities.setDeleted(false);
        cartEntities.setPriceOfProduct(product.get().getPriceOfProduct());
        cartEntities.setUpdatedBy("duongtv");
        cartRepository.save(cartEntities);
    }
}
