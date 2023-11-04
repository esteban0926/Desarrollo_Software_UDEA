package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.Product;
import com.udea.Spint3.entity.User;
import com.udea.Spint3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FrontController {
    @Autowired
    ProductService productService;

    @GetMapping({"/", "/index"})
    public String Index(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "index";
    }

    @GetMapping("/products")
    public String product(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "product";
    }
    @GetMapping("/newProduct")
    public String newProduct(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "newProduct";
    }



    @GetMapping("/signup")
    public String registro(Model model) {
        User usuario = new User();
        model.addAttribute("usuario", usuario);
        return "signup";

    }


}








