import java.util.Scanner;
public class TareaLibreria {

	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		System.out.println("Escriba el titulo del libro:");
		String titulo= dato.nextLine();
		System.out.println("Ingrese el id:");
		int id= Integer.parseInt(dato.nextLine());
		System.out.println("Ingrese el precio");
		double precio= Double.parseDouble(dato.nextLine());
		System.out.println("Proporciona el envio gratis, si si true, y sino false");
		boolean envio= Boolean.parseBoolean(dato.nextLine());
		System.out.println("Titulo y id: " +titulo +", #"+id);
		System.out.println("El precio es: "+ "$" +precio);
		if (envio) {
			System.out.println("El envio es gratuito");
		}
		else {
			System.out.println("el envio no es gratuito");
		}
	
		
		 

	}

}
