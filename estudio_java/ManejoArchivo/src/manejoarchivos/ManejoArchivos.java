package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
	
	public static void crearArchivo(String nombreArchivo) {
		File archivo= new File(nombreArchivo);
		try {
			PrintWriter salida= new PrintWriter(archivo);
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(System.out);
		}
	}
	
	public static void escribirEnArchivo (String nombreArchivo, String contenido) {
		File archivo= new File(nombreArchivo);
		try {
			PrintWriter salida= new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha escrito al archivo");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(System.out);
		}
	}
	
	public static void anexarAchivo(String nombreAchivo,String contenido ) {
		File archivo= new File(nombreAchivo);
		try {
			PrintWriter salida= new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha anexado informacion al archivo");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(System.out);
		} catch (IOException e) {
			
			e.printStackTrace(System.out);
		}
	}
	
	public static void leerArchivo (String nombreArchivo) {
		var archivo= new File(nombreArchivo);
		try {
			var entrada= new BufferedReader(new FileReader(archivo));
			var lectura= entrada.readLine();
			while (lectura != null) {
				System.out.println("Lectura = "+ lectura);
				lectura= entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		
	}

}
