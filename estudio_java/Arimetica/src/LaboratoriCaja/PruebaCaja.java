package LaboratoriCaja;
import java.util.Scanner;
public class PruebaCaja {

	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese el ancho");
		var a= Float.parseFloat(dato.nextLine());
		System.out.println("Ingrese el alto");
		var b= Float.parseFloat(dato.nextLine());
		System.out.println("Ingrese la profundidad");
		var c= Float.parseFloat(dato.nextLine());
		Caja valorcaja= new Caja (a,b,c);
		System.out.println("Volumen: "+ valorcaja.calcularVolumen());

	}

}
