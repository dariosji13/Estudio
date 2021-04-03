import java.util.Scanner;
public class HolaMundo {

	public static void main(String args[]) {
    Scanner dato= new Scanner(System.in);
    var contador= 0;
    while(contador<6) {
    	contador++;
    System.out.println("Intriduzaca su nombre: ");
    var nombre= dato.nextLine();
    nombre=nombre.toLowerCase();
    var apodo= "Usted no tiene apodo";
    switch (nombre) {
    case "laura":
    	apodo= "El apodo de Laura es: Lora";
    	break;
    case "fernando":
    	apodo= "El apodo de Fernando es: Iguana";
    	break;
    case "gloria": 	
    	apodo= "El apodo de Gloria es: Mona";
    	break;
    case "cesar":
    	apodo=" El apodo de Cesar es: Gallina o pollo";
    	break;
    case "max":
    	apodo="El apodo de Max es: Tasmania";
    	break;
    case "daniel":
    	apodo="El apodo de Daniel es: Gogzilla";
    	break;
    	default:
    		apodo="No se encuentra en la base de datos";
    	
    }	
    System.out.println(apodo);
    }
	
	}

}
