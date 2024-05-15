package com.example.registro.productos.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
       Controllers, se gestionan todos los endpoinsts de la aplicacion
       y sus peticiones Get, Post, Put, Delete.
 */

@RestController
@RequestMapping (path = "api/v1/products")
public class ProductController {

    //Hcermos una inyeccion de dependencias
    private final  ProductService productService;


    @Autowired
    public ProductController (ProductService productService){
         this.productService = productService;
    }
    @GetMapping
    public List <product> getProduct(){
    return productService.getProduct();
    }
    @GetMapping("/{id}")
    public product getUserById(@PathVariable Long id) {
        return productService.getUserById(id);

    }
    @PostMapping
    public product createProduct(@RequestBody product product) {
        return productService.createProduct(product);

    }
    @PutMapping
    public product updateProduct(@RequestBody product product) {
        return productService.updateProduct(product);

    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        productService.deleteUserById(id);
        return "MESSAJE: Deleted Successfully";
    }

}
