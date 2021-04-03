import java.util.Scanner;
public class MayorDosNumeros {

	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		System.out.println("Introduzca el numero1:");
		var num1= Integer.parseInt(dato.nextLine());
		System.out.println("Introduzca el numero2:");
		var num2= Integer.parseInt(dato.nextLine());
		if (num1==num2) {
			System.out.println("numero1 y numero2 son iguales");
		}
		else {
			var resultado= (num1>num2)? "numero1 es mayo que numero2" :"numero2 es mayor que numero1";
			System.out.println(resultado);
		}
	}

}
