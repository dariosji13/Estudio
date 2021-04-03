package test;

import domain.*;

public class TestSobreescritura {

	public static void main(String[] args) {
		
		Empleado empleado= new Empleado("Juan",5000);
		//System.out.println("empleado: "+empleado.ObtenerDetalles());
		imprimir(empleado);
		Gerente gerente= new Gerente("karla", 10000, "Contabilidad");
		//System.out.println("gerente: "+gerente.ObtenerDetalles());
		imprimir(gerente);

	}
	 public static void imprimir(Empleado empleado) {
		 String detalles= empleado.ObtenerDetalles();
		 System.out.println("empleado = "+detalles);
	 }


}
