package test;

import domain.*;

public class TestInstanceOf {

	public static void main(String[] args) {
		
		Empleado empleado= new Empleado("Juan",5000);
		determinarTipo(empleado);
		Gerente gerente= new Gerente("karla", 10000, "Contabilidad");
		//determinarTipo(gerente);

	}
	 public static void determinarTipo(Empleado empleado) {
		 if(empleado instanceof Gerente) {
			System.out.println("Esde tipo Gerente"); 
			System.out.println("Gerente: "+((Gerente) empleado).getDepartamento());
		 }else if(empleado instanceof Empleado) {
			 System.out.println("Esde tipo Empleado"); 
		 }else if(empleado instanceof Object) {
			 System.out.println("Esde tipo Object"); 
			 
		 }
	 }


}
