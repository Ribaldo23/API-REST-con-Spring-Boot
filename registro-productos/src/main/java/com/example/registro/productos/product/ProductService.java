package com.example.registro.productos.product;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import java.util.List;
/*
    Services, se gestiona la funcionalidad y
    la logica de la aplicacion
 */


@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired

    public List<product> getProduct() {
        return this.productRepository.findAll();
    }
    public product updateProduct(product product) {
        return productRepository.save(product);
    }

    public product createProduct(product product) {
     return productRepository.save(product);
    }
    public product getUserById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUserById(Long id) {
        productRepository.deleteById(id);
    }


}
