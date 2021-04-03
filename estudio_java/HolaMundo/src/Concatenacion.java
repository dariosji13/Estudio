
public class Concatenacion {

	public static void main(String[] args) {
		var usuario ="Juan";
		var titulo ="Ingeniero";
		
		var union = titulo + " " + usuario;
		System.out.println("union = " + union);
		
		var i=3;
		var j=4;
		System.out.println(i+j);
		System.out.println(i+j + " "+ usuario);//evaluacion de izq a der, realiza suma
		System.out.println(usuario+" "+ i+j);//contexto cadena, todo lo toma como una cadena
		System.out.println(usuario+" "+ (i+j));//como se usa un parentisis, se realiza la suma dentro de el, ya que modifica la prioridad
		
		

	}

}
