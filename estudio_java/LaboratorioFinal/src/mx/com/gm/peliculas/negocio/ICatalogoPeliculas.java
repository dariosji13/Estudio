package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.excepciones.*;


public interface ICatalogoPeliculas {
	
	String NOMRE_RECURSO="´peliculas.txt";
	
	 void agregarPeliculas(String nombrePelicula);
	
	 void listarPeliculas();
	
	 void buscarPelicula( String buscar);
	
	 void iniciarCatalogoPeliculas ();

}
