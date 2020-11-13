package com.proyecto.carrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.carrito.entity.Cliente;
import com.proyecto.carrito.service.Clienteservice;

@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
	@Autowired
    private Clienteservice clienteservice;
	
	@PostMapping("/Crear")
    public ResponseEntity<?> save(@RequestBody Cliente cliente) {
		clienteservice.guardar(cliente);
		return new ResponseEntity("Cliente Guardado", HttpStatus.CREATED);
	}
}
