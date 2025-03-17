package com.digitechfp.curso_ad.springboot2dtry.controllers;

import com.digitechfp.curso_ad.springboot2dtry.models.Producto;
import com.digitechfp.curso_ad.springboot2dtry.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/todos")
    public List<Producto> listarTodosLosProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    @GetMapping("/menor-precio")
    public List<Producto> listarProductosMenorA(@RequestParam int precio) {
        try {
            return productoService.obtenerProductosPorPrecioMenorA(precio);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("listar productos me da error por quinta vez: " + e.getMessage());
        }
    }

}
