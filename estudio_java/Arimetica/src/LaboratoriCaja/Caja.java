package LaboratoriCaja;

public class Caja {
	float ancho;
	float alto;
	float profundo;
	
public Caja() {// constructor vacio
	System.out.println("Inicializando");
	
}
// construcror no vacio
public Caja (float a, float b, float c) {
	this.ancho=a;
	this.alto=b;
	this.profundo=c;
}
public float calcularVolumen() {
	return ancho*alto*profundo;

}

}
