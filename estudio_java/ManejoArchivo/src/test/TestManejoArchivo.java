package test;
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivo {

	public static void main(String[] args) {
		var nombreArchivo="prueba.txt";
		//crearArchivo(nombreArchivo);
		
		escribirEnArchivo(nombreArchivo, "Hola desde java");
		anexarAchivo(nombreArchivo, "adios");
		leerArchivo(nombreArchivo);
		
		
	}

}
