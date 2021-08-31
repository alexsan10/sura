package com.sura.clientes.models.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="producto")
public class Cliente implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="claveproducto")
	private Long id;
	
	private String nombre;
	
	private Double precio;
	
	private int cantalmacen;
	
	private Date fechaCaducidad;
	
	


	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Double getPrecio() {
		return precio;
	}




	public void setPrecio(Double precio) {
		this.precio = precio;
	}







	public int getCantalmacen() {
		return cantalmacen;
	}




	public void setCantalmacen(int cantalmacen) {
		this.cantalmacen = cantalmacen;
	}




	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}




	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
