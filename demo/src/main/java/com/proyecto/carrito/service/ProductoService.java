package com.proyecto.carrito.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.carrito.entity.*;
import com.proyecto.carrito.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productorepository;
	
	public List<Producto> obtenerTodos(){
        List<Producto> lista = (List<Producto>) productorepository.findAll();
        return lista;
    }

    public Optional<Producto> obtenerPorId(Long id){
        return productorepository.findById(id);
    }

    
    public void guardar(Producto producto){
    	productorepository.save(producto);
    }

    public void borrar(Long id){
    	productorepository.deleteById(id);
    }


}
