package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {

	public static void main(String[] args) {
		Monitor monitorHp=new Monitor ("HP",13);
		Teclado tecladoHP= new Teclado("bluetooth","HP");
		Raton ratonHP= new Raton("bluetooth","HP");	
		Computadora computadoraHP= new Computadora("Computadora HP", monitorHp, tecladoHP, ratonHP);
		
		Monitor monitorGamer=new Monitor ("Gamar",34);
		Teclado tecladoGamer= new Teclado("bluetooth","Gamer");
		Raton ratonGamer= new Raton("bluetooth","Gamer");	
		Computadora computadoragamer= new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer);
		
		Orden orden1= new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoragamer);
				
		orden1.mostrarOrden();
	}

}
