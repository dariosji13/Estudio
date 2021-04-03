import java.util.Scanner;
public class EscanearDatos {

	public static void main(String[] args) {
		System.out.println("Proporciona el titulo: ");
		Scanner consola=new Scanner(System.in);
		var titulo= consola.nextLine();
		System.out.println("Proporciona el Autor: ");
		var autor= consola.nextLine();
		System.out.println(titulo+ " fue escrito por "+ autor);
		
		

		

	}

}
