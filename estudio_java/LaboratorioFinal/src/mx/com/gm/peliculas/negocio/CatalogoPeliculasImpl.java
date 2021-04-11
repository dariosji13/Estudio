package mx.com.gm.peliculas.negocio;

import java.util.List;

import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatodEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;


public class CatalogoPeliculasImpl  implements ICatalogoPeliculas{
	
	private final IAccesoDatos datos;
	
	

	public CatalogoPeliculasImpl() {
		this.datos = new AccesoDatosImpl();
		
	}

	@Override
	public void agregarPeliculas(String nombrePelicula) {
		Pelicula pelicula= new Pelicula(nombrePelicula);
		boolean anexar=false;
		try {
			anexar= datos.existe(NOMRE_RECURSO);
			datos.escribir(pelicula, NOMRE_RECURSO, anexar);
		} catch (AccesoDatodEx e) {
			System.out.println("Error en el acceso a datos");
			e.printStackTrace(System.out);
	// no se propaga la excepcion ya que la capa que sigue seria la de presentacion
			
		}
		
	}

	@Override
	public void listarPeliculas() {
		try {
			List<Pelicula> peliculas= this.datos.listar(NOMRE_RECURSO);
			for (Pelicula pelicula:peliculas) {
				System.out.println("Pelicula "+pelicula);
			}
		} catch (LecturaDatosEx e) {
			System.out.println("Error de acceso datos");
			e.printStackTrace(System.out);
	// no se propaga la excepcion ya que la capa que sigue seria la de presentacion
		}
		
	}

	@Override
	public void buscarPelicula(String buscar) {
		String resultado= null;
		try {
			resultado= datos.buscar(NOMRE_RECURSO, buscar);
		} catch (LecturaDatosEx e) {
			System.out.println("Error al buscar pelicula");
			e.printStackTrace(System.out);
		}
		System.out.println("resultado= "+ resultado);
		
	}

	@Override
	public void iniciarCatalogoPeliculas() {
		try {
			if(this.datos.existe(NOMRE_RECURSO)) {
				datos.borrar(NOMRE_RECURSO);
				datos.crear(NOMRE_RECURSO);
			}else {
				datos.crear(NOMRE_RECURSO);
			}
		} catch (AccesoDatodEx e) {
			System.out.println("Error al crear catalogo de peliculas");
			e.printStackTrace(System.out);
		}
		
	}

}
