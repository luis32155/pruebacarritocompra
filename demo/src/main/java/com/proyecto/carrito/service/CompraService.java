package com.proyecto.carrito.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.carrito.entity.DetalleVenta;
import com.proyecto.carrito.entity.Venta;
import com.proyecto.carrito.repository.DetalleRepository;
import com.proyecto.carrito.repository.VentaRepository;
@Service
public class CompraService implements Compraserviceinterface {

	@Autowired
	private VentaRepository repositorycompra;
	
	@Autowired
	private DetalleRepository repositorydetalle;

	
	@Override
	public List<Venta> listarOrden() {
		// TODO Auto-generated method stub
		return (List<Venta>) repositorycompra.findAll();
	}

	@Override
	public Optional<Venta> getByid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Venta Save(Venta compra) {
		//Actualizar el Stock Actual de cada Producto
		
				repositorycompra.save(compra);
				 
			        compra.getListaDetalleCompra().forEach(detalleCompra -> {
			            detalleCompra.setCompra(compra);
			            repositorydetalle.save(detalleCompra);
			        });
			        return compra;
			    }
	

	@Override
	public Optional<DetalleVenta> buscarByid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
