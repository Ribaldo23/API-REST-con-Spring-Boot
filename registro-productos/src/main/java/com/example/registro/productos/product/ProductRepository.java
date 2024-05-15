package com.example.registro.productos.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
/*
     Repositories, se controlan el acceso a la base de datos
 */

@Repository
public interface ProductRepository extends JpaRepository <product, Long> {

    Optional<product> findProductById(Long id);
}
