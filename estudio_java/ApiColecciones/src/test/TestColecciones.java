package test;

import java.util.*;



public class TestColecciones {

	public static void main(String[] args) {
		List miLista= new ArrayList();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Viernes");
		//imprimir(miLista);
		
	//	//ciclo foreach de la forma tradicional
	//	for (Object elemento: miLista) {
	//		 System.out.println("elemento: "+ elemento);
	//	}
	//	
	//	//ciclo for each utilizando la funcion landa o  flecha
	//	miLista.forEach(elemento -> {
	//		 System.out.println("elemento: "+ elemento);
	//	});
		
		Set miSet= new HashSet();
		miSet.add("Lunes1");
		miSet.add("Martes1");
		miSet.add("Miercoles1");
		miSet.add("Jueves1");
		miSet.add("Viernes1");
		miSet.add("Viernes1");
		//imprimir(miSet);
		
		Map miMapa= new HashMap();
		miMapa.put("D",5 );
		miMapa.put("C",4 );
		miMapa.put("A",3);
		 
		int elemento= (int)miMapa.get("D");
		//System.out.println("elemento: "+ elemento);
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
		
	}
	public static void imprimir(Collection coleccion) {
		coleccion.forEach(elemento -> {
			System.out.println("elemento: "+ elemento);
		});
	}

}
