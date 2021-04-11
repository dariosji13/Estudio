package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;


public class catalogoPeliculasPresentacion {

	public static void main(String[] args) {
		int opcion=-1;
		String nombrePelicula;
		 String buscar;
		 Scanner n= new Scanner(System.in); 
		 ICatalogoPeliculas catologo= new CatalogoPeliculasImpl();
		 
		 while( opcion!=0) {
			 System.out.println("Elige una opcion: \n"
					 +"1.Iniciar catalogo peliculas\n"
					 +"2.Agragar pelicula\n"
					 +"3.Listar peliculas\n"
					 +"4.Buscar pelicula\n"
					 +"0.Para salir");
			 opcion= Integer.parseInt(n.nextLine());
			switch (opcion) {
			case 0:
				System.out.println("Hasta pronto");
				break;
			case 1:
				 catologo.iniciarCatalogoPeliculas();
				 break;
			 case 2:
				System.out.println("Ingrese el nombre de la pelicula que desea agregar");
				nombrePelicula= n.nextLine();
				 catologo.agregarPeliculas(nombrePelicula);
				 break;
			 case 3:
				 catologo.listarPeliculas();
				 break;
			 case 4:
				 System.out.println("Ingrese el nombre de la pelicula que desea Buscar");
				 buscar= n.nextLine();
				 catologo.buscarPelicula(buscar);
				 break;
			default :
				System.out.println("Opcion no reconocida");
				break;
			 }
			 
		 }

	}

}
