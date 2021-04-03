package test;
import dominio.Persona;

public class PersonaPrueba {
	public static void main(String[] args) {
		Persona persona1= new Persona("Juan",5000.00,false);
		System.out.println("Persona1: "+persona1);
		persona1.setNombre("Juan carlos");
		persona1.setEliminado(true);
		System.out.println("Persona1: "+persona1.toString());
		Persona persona2= new Persona("Maria",10000.00,true);
		System.out.println("Persona2: "+persona2);
		persona2.setNombre("Maria Victoria");
		persona2.setEliminado(false);
		persona2.setSueldo(13000.00);
		System.out.println("Persona2: "+persona2);
		
		
	}

}
