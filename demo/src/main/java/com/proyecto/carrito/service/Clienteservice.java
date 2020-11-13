package com.proyecto.carrito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.carrito.entity.Cliente;
import com.proyecto.carrito.repository.ClienteRepository;

@Service
public class Clienteservice {

	@Autowired
	ClienteRepository clienterepository;
	
	
	 public void guardar(Cliente cliente){
		 clienterepository.save(cliente);
	    }

}
