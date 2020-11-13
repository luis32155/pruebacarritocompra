package com.proyecto.carrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.carrito.entity.Cliente;
import com.proyecto.carrito.entity.Producto;
import com.proyecto.carrito.service.ProductoService;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/Producto")

public class ProductoController {

	
	@Autowired
	ProductoService serviceproducto;
	
	@GetMapping("/ListarProducto")
	private ResponseEntity<List<Producto>> listarProducto(){
	  List<Producto> lista = serviceproducto.obtenerTodos();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	@GetMapping("/BuscarProducto/{id}")
	private ResponseEntity<Producto> BuscarIdProducto(@PathVariable("id") long id){
	Optional<Producto> buscar = serviceproducto.obtenerPorId(id);
	return new ResponseEntity(buscar,HttpStatus.OK);
	}
	
	@PostMapping("/CrearProducto")
    public ResponseEntity<?> save(@RequestBody Producto producto) {
		serviceproducto.guardar(producto);
		return new ResponseEntity("Producto Guardado", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> eliminarCategoria(@PathVariable(value = "id") long id){
		serviceproducto.borrar(id);
	    return new ResponseEntity("El Producto se eliminó exitosamente",HttpStatus.OK);
	}
	
}
