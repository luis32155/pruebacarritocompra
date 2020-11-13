package com.proyecto.carrito.service;
import java.util.List;
import java.util.Optional;

import com.proyecto.carrito.entity.DetalleVenta;
import com.proyecto.carrito.entity.Venta;
public interface Compraserviceinterface {
	
	public List<Venta> listarOrden();
	
	public Optional<Venta> getByid(Long id);
	
	public Venta Save(Venta compra);
	
	public Optional<DetalleVenta> buscarByid(Long id);
	

}
