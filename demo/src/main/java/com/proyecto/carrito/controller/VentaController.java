package com.proyecto.carrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.carrito.entity.Venta;
import com.proyecto.carrito.service.CompraService;
import java.util.*;
@RestController
@RequestMapping("/api/Compra")
public class VentaController {
	
	@Autowired
	private CompraService compraservice;
	
	@GetMapping("/ListarCompra")
	public ResponseEntity<List<Venta>> listarCompras(){
		 List<Venta> lista = compraservice.listarOrden();
	        return new ResponseEntity(lista, HttpStatus.OK);
	}
    @GetMapping("/Buscar/{id}")
    public ResponseEntity<Venta> getById(@PathVariable("id") Long idCompra) {
        Optional<Venta> ordencompra = compraservice.getByid(idCompra);
    	return new ResponseEntity(ordencompra,HttpStatus.OK);
    }
    @PostMapping("/Guardar")
    public ResponseEntity<Venta> save(@RequestBody Venta compra) {
        compraservice.Save(compra);
        return new ResponseEntity("Orden de Compra Guardada Guardado", HttpStatus.CREATED);
    }

}
