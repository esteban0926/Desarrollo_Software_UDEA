package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.Product;
import com.udea.Spint3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product product){
        double total = product.getPrecio() * product.getCantidad();
        product.setTotal(total);
        return productService.saveProduct(product);
    }
    @GetMapping("/product/{id}")
    public Product getProductId(@PathVariable Integer id){
        return productService.getProductId(id);
    }
    @PatchMapping("/updateproduct/{id}")
    public void updateProduct (@PathVariable Integer id, @RequestBody Product product){
        double total = product.getPrecio() * product.getCantidad();
        product.setTotal(total);
        productService.updateProduct(id, product);
    }
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }
}
