package Operaciones;

public class PruebaArimetica {

	public static void main(String[] args) {
		// variables locales
		var a= 10;
		var b=2;
		miMetodo();
		
		Arimetica arimetica1=new Arimetica();
		System.out.println("arimetica1.a: "+ arimetica1.a);
		System.out.println("arimetica1.b: "+ arimetica1.b);
		 
		Arimetica arimetica2= new Arimetica (5,8);
		System.out.println("arimetica2.a: "+ arimetica2.a);
		System.out.println("arimetica2.b: "+ arimetica2.b);
	}
	public  static void miMetodo() {
	//	a=10; // sale con error poque ya esta fura del metodo main
		System.out.println("Otro metodo");
	}

}
