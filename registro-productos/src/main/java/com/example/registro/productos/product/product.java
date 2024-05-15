package com.example.registro.productos.product;

import jakarta.persistence.*;

import java.time.LocalDate;
/*
      En esta clase se representan cada una de las entidadades
      de nuestra aplicacion
 */


@Entity
@Table
public class product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nombre;

    private Float precio;

    private LocalDate fecha ;

    public product() {
    }

    public product(Long id, String nombre, Float precio, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public product(String nombre, LocalDate fecha, Float precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
