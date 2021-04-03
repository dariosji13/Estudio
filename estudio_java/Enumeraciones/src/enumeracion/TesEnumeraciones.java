package enumeracion;
import enumeracion.*;
public class TesEnumeraciones {

	public static void main(String[] args) {
		//System.out.println("Dia 1: "+Dias.LUNES);
		//indicarDiaSemana(Dias.DOMINGO);
		
		System.out.println("Continente no. 4: "+Continentes.AMERICA);
		System.out.println("No. Paises en el 4to continente: "
		            +Continentes.AMERICA.getPaises());
		System.out.println("Continente no. 1: "+Continentes.AFRICA);
		System.out.println("No. Paises en el 1to continente: "
		            +Continentes.AFRICA.getPaises());

	}
	private static void indicarDiaSemana(Dias dias) {
		switch (dias){
			case LUNES:
				System.out.println("Primer dia de las semana");
				break;
			case MARTES:
				System.out.println("Segundo dia de las semana");
				break;	
			case MIERCOLES:
				System.out.println("Tercer dia de las semana");
				break;	
			case JUEVES:
				System.out.println("Cuarto dia de las semana");
				break;
			case VIERNES:
				System.out.println("Quinto dia de las semana");
				break;
			case SABADO:
				System.out.println("Sexto dia de las semana");
				break;
			case DOMINGO:
				System.out.println("Septimo dia de las semana");
				break;	
		}
	}

}
