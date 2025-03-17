package com.digitechfp.curso_ad.springboot2dtry.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int precio;

    private int stock;
}
