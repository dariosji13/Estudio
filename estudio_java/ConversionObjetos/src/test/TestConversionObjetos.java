package test;

import domain.*;

public class TestConversionObjetos {

	public static void main(String[] args) {
		Empleado empleado;
		empleado= new Escritor("juan", 5000, TipoEscritura.CLASICO);
		// System.out.println("empleado"+empleado);
		
		//System.out.println(empleado.ObtenerDetalles());
		
		// downcasting es necesario indicar 
		//((Escritor)empleado).getTipoEscritura();
		
		Escritor escritor= (Escritor) empleado;
		escritor.getTipoEscritura();
		
		// upcasting
		Empleado empleado2= escritor;
		empleado2.ObtenerDetalles();
		System.out.println(empleado2.ObtenerDetalles());

	}

}
