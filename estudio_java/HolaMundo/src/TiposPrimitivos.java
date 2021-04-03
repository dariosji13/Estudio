import java.util.Scanner;
public class TiposPrimitivos {

	public static void main(String[] args) {
		/*
		 * tipos primitivos enteros: byte,short, int, long
		 */
		byte numeroByte= 10;
		System.out.println("valor byte: " + numeroByte);
		System.out.println("valor minimo de byte: "+ Byte.MIN_VALUE);
		System.out.println("valor maximo de byte: "+ Byte.MAX_VALUE);
		
		short numeroShort= 15;
		System.out.println("valor de short: "+ numeroShort);
		System.out.println("valor minimo de short: "+ Short.MIN_VALUE);
		System.out.println("valor maximo de short: "+ Short.MAX_VALUE);
		
		int numeroInt= 20;
		System.out.println("valor de int: "+ numeroInt);
		System.out.println("valor minimo de int: "+ Integer.MIN_VALUE);
		System.out.println("valor maximo de short: "+ Integer.MAX_VALUE);
		
		long numeroLong= 25;
		System.out.println("valor de long: "+ numeroLong);
		System.out.println("valor minimo de long: "+ Long.MIN_VALUE);
		System.out.println("valor maximo de long: "+ Long.MAX_VALUE);
		/*
		 * tipos primitivos de tipo flotante: float y double
		 */
		float numeroFloat=  (float)30.0;
		System.out.println("valor de  tipo float: "+ numeroFloat);
		System.out.println("valor minimo de  tipo float: "+ Float.MIN_VALUE );
		System.out.println("valor maximo de  tipo float: "+ Float.MAX_VALUE);
		
		double numeroDouble=  35.4;
		System.out.println("valor de  tipo double: "+ numeroDouble);
		System.out.println("valor minimo de  tipo double: "+ Double.MIN_VALUE);
		System.out.println("valor maximo de  tipo double: "+ Double.MAX_VALUE);
		
		char miCaracter= 'a';
		System.out.println("miCaracter: "+ miCaracter);
		
		char varChar= '\u0021';
		System.out.println("varChar: "+varChar);
		
		char varCharDecimal= 33;
		System.out.println("varCharDecimal : "+varCharDecimal);
		
		char varCharSimbolo= '!';
		System.out.println("varCharSimbolo : "+varCharSimbolo);
		
		var varChar1= '\u0021';
		System.out.println("varChar1: "+varChar1);
		
		var varCharDecimal1= 33;
		System.out.println("varCharDecimal1 : "+varCharDecimal1);
		
		var varCharSimbolo1= '!';
		System.out.println("varCharSimbolo1 : "+varCharSimbolo1);
		
		boolean varBoolean= true;
		System.out.println("varBoolean: "+ varBoolean);
		
		if(varBoolean) {
			System.out.println("La bandera es verdeadera");
		}
		else {
			System.out.println("La bandera es falsa");
		}
		var edad= 3;
		if (edad>=18) {
			System.out.println(" Eres mayor de eada");
		}
		else {
			System.out.println("Eres menor de edad");
		}

	}

}
