package com.proyecto.carrito.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.entity.Cliente;
@Repository
public interface ClienteRepository  extends CrudRepository<Cliente,Long	>{

}
