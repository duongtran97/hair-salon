package com.duongtv.hair.controller;

import com.duongtv.hair.entities.CartEntities;
import com.duongtv.hair.entities.ProductEntities;
import com.duongtv.hair.services.CartService;
import com.duongtv.hair.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping("/cart")
    public String openCart(Model model){
        model.addAttribute("cartEntities",new CartEntities());

        return "user/cart";
    }
    @GetMapping("/cart/add")
    public String addProductFromShopToCart(@RequestParam String id, Model model)throws Exception{
        cartService.addProductToCart(id);

        return "redirect:/homepage";
    }
}
