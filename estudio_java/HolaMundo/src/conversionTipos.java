import java.util.Scanner;
public class conversionTipos {

	public static void main(String[] args) {
		//Convertir tipo String a un tipo Int
		var edad= Integer.parseInt("20");
		System.out.println("edad= "+(edad+1));
		var edad1= "20";
		System.out.println("edad1= "+(edad1+1));
		
		var valorPI= Double.parseDouble("3.1416");
		System.out.println("valorPI= " +valorPI);
		
		//pedir un valor
		var consola= new Scanner(System.in);
	//	System.out.println("ingresa tu edad:");
	//	edad= Integer.parseInt(consola.nextLine());
	//	System.out.println("edad= "+edad +" años");
		
		var edadTexto= String.valueOf(10);
		System.out.println("edadTexto= "+edadTexto);
		
		var caracter= "hola".charAt(2);
		System.out.println("caracter= "+caracter);
		System.out.print("proporciona un caracter");
		caracter= consola.nextLine().charAt(0);
		System.out.print("caracter= "+ caracter);
		
			
	}

}
