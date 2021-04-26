/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacio;

/**
 *
 * @author Daniel
 */
public enum OpcionesJuegoEnum {
   
    MENSAJE_BIENVENIDA("Bienvenido al juego"),
    MENSAJE_OPCIONES("Opciones: "),
    MENSAJE_OPCION_1_NUEVO_JUEGO("1. Nuevo juego"),
    MENSAJE_OPCION_2_CARGAR_JUEGO("2. Cargar juego");
    
    	private final String mensaje;
	
	OpcionesJuegoEnum(String mensaje){
		this.mensaje= mensaje;
	}

    public String getMensaje() {
        return mensaje;
    }
   
}
