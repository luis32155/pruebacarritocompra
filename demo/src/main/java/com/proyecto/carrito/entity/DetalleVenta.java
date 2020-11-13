package com.proyecto.carrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="detalleventa")
public class DetalleVenta {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idDetalleVenta")
	private long pk;
    @ManyToOne
	@JoinColumn(name="idProducto")
	private Producto producto;
    @JsonIgnore
	@ManyToOne
    @JoinColumn(name="idVenta")
    private Venta compra;
    public DetalleVenta() {
		this.producto = new Producto();
	}  
}
