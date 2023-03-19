package com.duongtv.hair.services;

import com.duongtv.hair.entities.CartEntities;
import com.duongtv.hair.entities.ProductEntities;
import com.duongtv.hair.repository.CartRepository;
import com.duongtv.hair.repository.ProductRepository;
import com.duongtv.hair.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private String billCode;

    public CartService() {
        this.billCode = CommonUtils.createBillCode();
    }

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;
    public void addProductToCart(String id)throws Exception{
        Long autoId = Long.valueOf(id);
        int countForProduct = 0;
        Optional<ProductEntities> product = productRepository.findById(autoId);
        CartEntities cartEntities = new CartEntities();
        cartEntities.setCodeOfProduct(product.get().getCode());
        cartEntities.setDeleted(false);
        cartEntities.setPriceOfProduct(product.get().getPriceOfProduct());
        cartEntities.setBillCode(billCode);
        cartEntities.setUpdatedBy("duongtv");
        cartRepository.save(cartEntities);
//        productRepository.
//        countForProduct  = cartRepository.findDistinctCartByCodeOfProduct();
//        countForProduct = productLstOnCart.size();
    }
    public int countProductOnCart(){
//        List<CartEntities> lstProductOnCart = cartRepository.findCodeOfProductDistinctByUpdatedBy("duongtv");
        List<String> lstProductOnCart = cartRepository.findDistinctCodeOfProductByUpdatedBy("duongtv");
        return lstProductOnCart.size();
    }
    public List<CartEntities> getLstProductAndSumValueOfBill(){
        List<CartEntities> lstProductOncart = cartRepository.findAllProductAddedOnCartByBillcode("");
//        int countcartRepository = cartRepository.countProductOnBillCode();
        for (CartEntities cartElement:lstProductOncart) {

        }
        return lstProductOncart;
    }
}
