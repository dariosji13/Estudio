package Clases;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona persona1= new Persona();
		persona1.nombre="Juan";
		persona1.apellido="Perez";
		persona1.desplegarInformacion();
		
		Persona persona2= new Persona();
		System.out.println("Persona1: "+persona1);
		System.out.println("Persona2: "+persona2);
		
		persona2.nombre="Fernando";
		persona2.apellido="Ospina";
		persona2.desplegarInformacion();

	}

}
