package com.digitechfp.curso_ad.springboot2dtry.services;

import com.digitechfp.curso_ad.springboot2dtry.daos.ProductoRepository;
import com.digitechfp.curso_ad.springboot2dtry.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public List<Producto> obtenerProductosPorPrecioMenorA(int precioMax) {
        if (precioMax < 0) {
            throw new IllegalArgumentException("Como va a haber un precio negativo churrilla");
        }
        return productoRepository.findByPrecioLessThan(precioMax);
    }

}
