package com.digitechfp.curso_ad.springboot2dtry.daos;

import com.digitechfp.curso_ad.springboot2dtry.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByPrecioLessThan(int precioMax);
}
