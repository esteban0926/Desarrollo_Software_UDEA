package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.Product;
import com.udea.Spint3.entity.User;
import com.udea.Spint3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FrontController {
    @Autowired
    ProductService productService;

    @GetMapping({"/", "/index"})
    public String Index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if (principal !=null){
            model.addAttribute("profile", principal.getClaims());
        }
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "index";
    }

    @GetMapping("/products")
    public String getproducts(Model model) {
        List<Product> productList = productService.getProducts();
        model.addAttribute("products", productList);
        return "product";
    }
    @GetMapping("/newProduct")
    public String newProduct(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "newProduct";
    }
    @GetMapping("/editProduct/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        Product product = productService.getProductById(id);
        if (product !=null){
            model.addAttribute("product",product);
            return "editProduct";
        }else {
            return "redirect:/products";
        }

    }
    @GetMapping("/signup")
    public String registro(Model model) {
        User usuario = new User();
        model.addAttribute("usuario", usuario);
        return "signup";

    }

    @GetMapping("/login")
    public String login() {

        return "login";

    }


}








