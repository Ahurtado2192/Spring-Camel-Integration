package com.insoft.propierties;

public class propierties {

	
	private int id_propiedad;
	private String descripcion;
	public int getId_propiedad() {
		return id_propiedad;
	}
	public void setId_propiedad(int id_propiedad) {
		this.id_propiedad = id_propiedad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "propierties [id_propiedad=" + id_propiedad + ", descripcion="
				+ descripcion + "]";
	}
	public propierties(int id_propiedad, String descripcion) {
 		this.id_propiedad = id_propiedad;
		this.descripcion = descripcion;
	}
	public propierties(){
		
	}
	
}
