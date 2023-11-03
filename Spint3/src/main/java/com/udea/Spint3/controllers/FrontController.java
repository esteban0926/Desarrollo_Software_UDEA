package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.Product;
import com.udea.Spint3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FrontController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public String product(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "product";
    }
}









