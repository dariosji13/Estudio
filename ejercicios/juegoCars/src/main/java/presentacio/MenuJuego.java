/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacio;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class MenuJuego {
    
    Scanner n = new Scanner(System.in);
    

    public MenuJuego() {
    }

    public void menuDeBienvenidadYOpciones() {
        System.out.println(OpcionesJuegoEnum.MENSAJE_BIENVENIDA.getMensaje());
        System.out.println(OpcionesJuegoEnum.MENSAJE_OPCIONES.getMensaje());
        System.out.println(OpcionesJuegoEnum.MENSAJE_OPCION_1_NUEVO_JUEGO.getMensaje());
        System.out.println(OpcionesJuegoEnum.MENSAJE_OPCION_2_CARGAR_JUEGO.getMensaje());
       
    }
    
    public void menuNumeroDeJugadores(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_NUMERO_JUGADORES.getMensaje());
       
    }
    
    
    public void menuLargoPista(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_LARGO_PISTA.getMensaje());
    }
    
    
    public void mensajeNombreJugador(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_NOMBRE_JUGADOR.getMensaje());
    }
    
    
    public void mansajeColorCarro(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_COLOR_CARRO.getMensaje());
    }
    
    
    public void mesajeTurnoJugador(String nombreJugador){
        System.out.println(OpcionesJuegoEnum.MENSAJE_TUNO_JUGADOR.getMensaje()+ " "+ nombreJugador); 
    }
    
    
    public void mensajeValorDados(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_VALOR_DE_DADOS.getMensaje()); 
    }
    
    
    public void mensajeAvance(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_AVANCE.getMensaje());
    }
    
    
    public void mensajeFaltaParaMeta(){
        System.out.println(OpcionesJuegoEnum.MENSAJE_FALTA_PARA_LA_META.getMensaje());
    }
    
    
    public int leerNumeroEntero (){
        return n.nextInt();
    }
    
    
    public double leerNumeroDouble (){
        return n.nextDouble();
    }
    
    
    public String leerString(){
        return n.next().toUpperCase();
    }
    
    
    
    

}
