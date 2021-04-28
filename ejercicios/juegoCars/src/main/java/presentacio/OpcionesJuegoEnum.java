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
    MENSAJE_OPCION_2_CARGAR_JUEGO("2. Cargar juego"),
    MENSAJE_NUMERO_JUGADORES("Ingrese el numero de jugadores: "),
    MENSAJE_LARGO_PISTA("Ingrese el largo de la pista en Kilometros: "),
    MENSAJE_NOMBRE_JUGADOR("Ingrese el nombre del jugador:"),
    MENSAJE_COLOR_CARRO("Ingrese el color del carro: "),
    MENSAJE_TUNO_JUGADOR("Es el turno del jugador: "),
    MENSAJE_VALOR_DE_DADOS("Ingrese el valor del dado: "),
    MENSAJE_AVANCE("Avanzaste: "),
    MENSAJE_FALTA_PARA_LA_META("Queda faltando para llegar a la meta: "); 
    
    
    
    	private final String mensaje;
	
	OpcionesJuegoEnum(String mensaje){
		this.mensaje= mensaje;
	}

    public String getMensaje() {
        return mensaje;
    }
   
}
