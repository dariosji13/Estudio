package test;

import genericos.ClaseGenerica;

public class TesGenerics {

	public static void main(String[] args) {
		
		ClaseGenerica<Integer> objetoInt= new ClaseGenerica<Integer>(15);
		objetoInt.obtenerTipo();
		
		ClaseGenerica<String> objetoString= new ClaseGenerica<String>("Hola");
		objetoString.obtenerTipo();

	}

}
