package com.proyecto.carrito.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.entity.Producto;
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
