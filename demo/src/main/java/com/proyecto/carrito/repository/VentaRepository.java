package com.proyecto.carrito.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.entity.Venta;
@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {

}
