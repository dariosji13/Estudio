package test;

public class TestArgumentosVariables {

	public static void main(String[] args) {
		imprimirNumero(3,4,5);
		imprimirNumero(1,2);
		variosParametros("juan", 8,9,10);
		

	}
	private static void variosParametros(String nombre,int...numeros ) {
		System.out.println("nombre= "+nombre);
		imprimirNumero(numeros);
	}
	
	private static void imprimirNumero (int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("elementos: "+numeros[i]);
		}
	}

}
