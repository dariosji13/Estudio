package domain;

import java.io.Serializable;

public class Persona implements Serializable{
	private String nombre;
	private String apellido;
	
	//este metodo si es requerido para ser un JavaBean
	public Persona() {
		
	}
	//este metodo no es requerido
	public Persona (String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// el metodo toString tampoco es requerido asi como el equal y hascode
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
