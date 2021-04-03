import java.util.Scanner;
public class OperadorTernario {

	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		var resultado=(3>2) ? "verdadero":"falso";
		System.out.println("resultado= "+ resultado);
		
		System.out.println("Ingrese un numero");
		var numero= Integer.parseInt(dato.nextLine());
	    var sol=(numero%2==0) ?"el numero es par" : "el numero es impar";
	    System.out.println(sol);
 
	}

}
