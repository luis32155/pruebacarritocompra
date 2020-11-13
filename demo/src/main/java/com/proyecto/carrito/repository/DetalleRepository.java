package com.proyecto.carrito.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.entity.DetalleVenta;
@Repository
public interface DetalleRepository extends CrudRepository<DetalleVenta,Long> {

}
