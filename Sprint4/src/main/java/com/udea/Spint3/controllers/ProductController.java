package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.Product;
import com.udea.Spint3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    /*
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

     */
    @PostMapping("/addProduct")
    public RedirectView saveProduct(@ModelAttribute Product product, Model model){
        double total = product.getPrecio() * product.getCantidad();
        product.setTotal(total);
        model.addAttribute(product);
        productService.saveProduct(product);
        return new RedirectView("/");
    }
    //Redirect View
    @GetMapping("/product/{id}")
    public Product getProductId(@PathVariable Integer id){
        return productService.getProductById(id);
    }


/*
    @PutMapping("/updateProduct/{id}")
    public void updateProduct (@PathVariable Integer id, @RequestBody Product product){
        double total = product.getPrecio() * product.getCantidad();
        product.setTotal(total);
        productService.updateProduct(id, product);
    }

 */

    @GetMapping("/deleteProduct/{id}")
    public RedirectView deleteProduct(@PathVariable Integer id){
         productService.deleteProduct(id);
         return new RedirectView("/");
    }
    @RequestMapping(value = "/updateProduct/{id}", method = {RequestMethod.POST, RequestMethod.PUT})
    public RedirectView updateProduct(@PathVariable Integer id, @ModelAttribute Product product){
        Product existing = productService.getProductById(id);

        if (existing != null) {
            existing.setNombre(product.getNombre());
            existing.setCategoria(product.getCategoria());
            existing.setPrecio(product.getPrecio());
            existing.setCantidad(product.getCantidad());
            existing.setImagen(product.getImagen());

            // Calcular el valor total
            double total = product.getPrecio() * product.getCantidad();
            existing.setTotal(total);

            productService.updateProduct(id, existing);
        }
        return new RedirectView("/");
    }


    }





