package com.proyecto.carrito.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="idVenta")
	private Long pk;
	@ManyToOne
	@JoinColumn(name="idCliente")
    private Cliente cliente;
	private String fecha;
	
	@OneToMany( cascade = CascadeType.ALL,mappedBy = "compra")
	private List<DetalleVenta> listaDetalleCompra;
	public Venta() {
		   this.cliente = new Cliente();
		   this.listaDetalleCompra = new ArrayList<DetalleVenta>();
		}
}
