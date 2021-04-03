package Clases;
import java.util.Scanner;
public class DeudaPapa {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Nombre de la deuda");
		var nombre= dato.nextLine();
		nombre= nombre.toLowerCase();
		System.out.println("Escriba el tiempo hace cuando le debe, el valor en años");
		var tiempo=Integer.parseInt(dato.nextLine());
		System.out.println("Escriba el precio de cada "+ nombre);
		var valor= Integer.parseInt(dato.nextLine());
		var a=1.0;
		var i=0;
		while(tiempo>i) {
			i++;			
			a=(a*0.28)+a;
		}
		var resultado=a;
		var precio= resultado*valor;
		System.out.println("Deuda por: "+nombre);
		System.out.println("con los intereses papa debe: "+resultado+" "+nombre);
		System.out.println("Deuda de papa en pesos: "+precio +" pesos");
		

	}

}
