package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;


public class AccesoDatosImpl implements IAccesoDatos {

	@Override
	public boolean existe(String nombreRecurso) throws AccesoDatodEx {
	   File archivo= new File(nombreRecurso);
	   return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
		File archivo= new File(nombreRecurso);
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			BufferedReader entrada= new BufferedReader(new FileReader(archivo));
			String lecturaLinea= null;
			lecturaLinea= entrada.readLine();
			while(lecturaLinea!= null) {
				Pelicula pelicula =new Pelicula(lecturaLinea);
				peliculas.add(pelicula);
				lecturaLinea= entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al listar peliculas: " +e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al listar peliculas: " +e.getMessage());
		}
		
		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
		File arcvivo= new File(nombreRecurso);
		try {
			PrintWriter salida= new PrintWriter(new FileWriter(arcvivo,anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se ha escrito informacion al archivo");
		} catch (IOException e) {
			e.printStackTrace();
			throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + e.getMessage());
		}
		
		
	}

	@Override
	public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
		File archivo=new File(nombreRecurso);
		String resultado= null;
		try {
			BufferedReader entrada= new BufferedReader(new FileReader(archivo));
			String lecturaLinea= null;
			lecturaLinea= entrada.readLine();
			int indice=1;
			while (lecturaLinea!=null) {
				if(buscar!=null && buscar.equalsIgnoreCase(lecturaLinea)) {
					resultado= "Pelicula: "+lecturaLinea+"encontrada en el indice: "+indice;
					break;
				}
				lecturaLinea= entrada.readLine();
				indice++;
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al buacar la pelicula: " +e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al buacar la pelicula: " +e.getMessage());
		}
		return resultado;
	}

	@Override
	public void crear(String nombreRecurso) throws AccesoDatodEx {
		File archivo= new File(nombreRecurso);
		PrintWriter salida;
		try {
			salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (IOException e) {
			e.printStackTrace();
			throw new AccesoDatodEx("Excpcion al crear archivo: " + e.getMessage());
		}
		
	}

	@Override
	public void borrar(String nombreRecurso) throws AccesoDatodEx {
		File archivo= new File(nombreRecurso);
		if(archivo.exists())
			archivo.delete();
		System.out.println("Archivo borrado");
		
		
		
	}
	
	

}
