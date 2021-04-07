package test;

import domain.*;

public class TestClasesAbstratas {

	public static  void main(String[] args) {
		
		//FiguraGeometrica figura= new FiguraGeometrica;
		// no se puede crear obletos de la clase padre poque esta marcada como abstrata
		
		FifuraGeometrica figura = new Rectangulo("Rectangulo");
		figura.dibujar();

	}

}