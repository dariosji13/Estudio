import java.util.Scanner;
public class ApodoEstacion{

	public static void main(String args[]) {
    Scanner dato= new Scanner(System.in);
    System.out.println("Que quiere hacer: apodos marca 1 y estaciones marca 2");
    var elegida= Integer.parseUnsignedInt(dato.nextLine());
    //elegida=elegida.toLowerCase(); con esta se convierte mayusculas en minusculas
    switch (elegida) {
    case 1:
    	System.out.println("El numero de nombres al que le va a sacar el apodo ,maximo 6");
    	int i= Integer.parseInt(dato.nextLine());
    	var contador=0;
    	while(contador<i) {
    		contador++;
    	System.out.println("Intriduzaca su nombre: ");
    	var nombre= dato.nextLine();
    	nombre=nombre.toLowerCase();
    	var apodo= "Usted no tiene apodo";
    	switch (nombre) {
    	case "laura":
    		apodo= "El apodo de Laura es: Lora";
    		break;
    	case "luis fernando":
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
    	case "yeison":
    		apodo= "El apodo de yeison es: caucho";
    		break;	
    		default:
    			apodo="No se encuentra en la base de datos";
    	  }	
    	System.out.println(apodo);
    	}
    	break;
    case 2:
    	System.out.println("Introduzca el mes");
    	 var mes= dato.nextLine();
    	 mes=mes.toLowerCase();
    	 var estacion= " Sin procesar";
    	 switch(mes) {
    	 case "diciembre": case "enero": case "febrero":
    		 estacion= "invierno";
    		 break;
    	 case "marzo": case "abril": case "mayo":
    		 estacion= "primavera";
    		 break;
    	 case "junio": case "julio": case "agosto":
    		 estacion="verano";
    		 break;
    	 case "septiembre": case "octubre": case "noviembre":
    		 estacion= "otoño";
    		 break;
    		 default:
    			 estacion= "mes no existente o mal copiado";
    	 }
    	 System.out.println("La estacion es: "+ estacion);
    	 break;
    	 default:
    		 System.out.println("Opcion no valida");
    	 }
    
    	
    }
    	
    }