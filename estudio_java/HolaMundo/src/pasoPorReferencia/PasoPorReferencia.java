package pasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {

	public static void main(String[] args) {
		Persona persona1= new Persona();
		persona1.nombre="juan";
		System.out.println("Nombre: "+persona1.nombre);
		persona1=cambiaValor(persona1);
		System.out.println("persona1 cambio de nombre:"+persona1.nombre);

	}
   public static Persona cambiaValor(Persona persona) {
	   persona.nombre= "Karla";
	   return persona;
   }
}
