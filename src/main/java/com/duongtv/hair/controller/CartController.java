package com.duongtv.hair.controller;

import com.duongtv.hair.entities.CartEntities;
import com.duongtv.hair.entities.ProductEntities;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String openCart(Model model){
        model.addAttribute("cartEntities",new CartEntities());
        boolean checkOnCartPage = true;
        model.addAttribute("checkOnCartPage",checkOnCartPage);
        return "user/cart";
    }
    @GetMapping("/cart/id=?")
    public String addProductFromShopToCart(@ModelAttribute ProductEntities product, Model model){

        return "user/cart";
    }
}
