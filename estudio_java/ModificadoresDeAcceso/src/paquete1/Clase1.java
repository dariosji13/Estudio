package paquete1;

public class Clase1 {
	/*1 Modificador public
	public String atributoPublico="Valor atributo publico";
	
	public Clase1() {
		System.out.println("Constructor publico");
	}
	public void metedoPublico(){
		System.out.println("Metodo publico");
	}
	*/
   protected String atributoprotected="Valor atributo protected";
	
	protected Clase1() {
		System.out.println("Constructor protected");
	}
	public Clase1(String arg) {
		System.out.println("Constructor publico");
	}
	protected void metedoProtected(){
		System.out.println("Metodo protected");
	}

}
