import java.util.Scanner;
public class AreaRectangulo {

	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		System.out.println("Ingrese la altura del rectandulo:");
		float altura= Float.parseFloat(dato.nextLine());
		System.out.println("Ingrese el ancho del rectangulo");
		float ancho= Float.parseFloat(dato.nextLine());
		float area= altura*ancho;
		float perimetro= 2*(altura+ancho);
		System.out.println("El area del rectangulo es: "+ area);
		System.out.println("El perimetro es: "+perimetro);
		

	}

}




 
