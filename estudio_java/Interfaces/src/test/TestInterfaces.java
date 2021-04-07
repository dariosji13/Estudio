package test;

import acessoDatos.*;


public class TestInterfaces {

	public static void main(String[] args) {
		//IAccesoDatos datos= new IAccesoDatos(); no se puede crear objetos a
		//diferencia de las clases hijas, padres y la abstrata
		IAccesoDatos datos= new ImplementacionMySqi();
		//datos.listar();
		imprimir(datos);
		datos= new ImplementacionOracle();
		//datos.listar();
		imprimir(datos);	
		}	
	
	public static void imprimir(IAccesoDatos datos) {
		datos.listar();
	}

	}


