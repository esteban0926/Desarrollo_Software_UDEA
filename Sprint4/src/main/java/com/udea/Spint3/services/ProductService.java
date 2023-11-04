package com.udea.Spint3.services;

import com.udea.Spint3.entity.Product;
import com.udea.Spint3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Metodo para obtener todos los productos.
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    //Metodo para crear un nuevo producto
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    //Metodo para obtener un producto por su ID.
    public Product getProductId(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    //Metodo para actualizar un producto existente
    public void updateProduct(Integer id, Product product) {
        Product existing = productRepository.findById(id).orElse(null);
        if (existing != null) {
            product.setId(id);
            productRepository.save(product);
        }

    }

    //Metodo para eliminar un producto por su ID.
    public String deleteProduct(Integer id) {
        productRepository.deleteById(id);
        return "Has eliminado el producto con el ID: " + id;
    }

}