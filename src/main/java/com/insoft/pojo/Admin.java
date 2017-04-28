package com.insoft.pojo;

import java.sql.Timestamp;

public class Admin {

	private int idAd;
	private String nombre;
	private String cargo;
	private Timestamp fecha;

	public Admin() {

	}

	public Admin(int idAd, String nombre, String cargo, Timestamp fecha) {
		this.idAd = idAd;
		this.nombre = nombre;
		this.cargo = cargo;
		this.fecha = fecha;
	}

	public Admin(String nombre, String cargo, Timestamp fecha) {
		this.nombre = nombre;
		this.cargo = cargo;
		this.fecha = fecha;
	}

	public int getIdAd() {
		return idAd;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Timestamp getfecha() {
		return fecha;
	}

	public void setfecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre
				+ ", cargo=" + cargo + ", fecha=" + fecha + "]";
	}

}
