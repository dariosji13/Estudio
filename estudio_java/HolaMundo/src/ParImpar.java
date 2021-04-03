import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		System.out.println("introduzca el numero");
		int numero= Integer.parseInt(dato.nextLine());
		if (numero%2==0) {
			System.out.println("El numero "+numero+" es par");				
			}
		else {
			System.out.println("El numero "+numero+" es impar");
		}
		
			
		
	}

}
