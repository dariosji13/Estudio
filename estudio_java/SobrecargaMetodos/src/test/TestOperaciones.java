package test;

import operaciones.Operaciones;

public class TestOperaciones {

	public static void main(String[] args) {
		var resultado= Operaciones.sumar(5,3);
		System.out.println("resultado = "+resultado);
		
		var resultado1= Operaciones.sumar(2.0, 3);
		System.out.println("resultado1 = "+resultado1);
	}

}
