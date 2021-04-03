package Operaciones;

public class Arimetica {
	int a;
	int b;
	
	// constructor vacio
	public Arimetica (){
		System.out.println("ejecutando constructor");
	}
	// constructor no vacio
	public Arimetica(int a,int b) {
		this.a= a;
		this.b=b;
		System.out.println("Ejecutando constructor con argumentos");
	}
	 
// metodo
	public void sumar() {
		int resultado= a+b;
		System.out.println("Resultado: "+ resultado);
		
	}
	
	public int sumarConRetorno () {
		return a+b;
	}
	public int sumarConArgumentos (int arg1,int arg2) {
		  a=arg1;
		  b=arg2;
		  return sumarConRetorno();
		  
	}

}
