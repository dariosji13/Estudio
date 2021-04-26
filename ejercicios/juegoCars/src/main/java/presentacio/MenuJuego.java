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

    public int Menu1() {
        System.out.println(OpcionesJuegoEnum.MENSAJE_BIENVENIDA.getMensaje());
        System.out.println(OpcionesJuegoEnum.MENSAJE_OPCIONES.getMensaje());
        System.out.println(OpcionesJuegoEnum.MENSAJE_OPCION_1_NUEVO_JUEGO.getMensaje());
        System.out.println(OpcionesJuegoEnum.MENSAJE_OPCION_2_CARGAR_JUEGO.getMensaje());
        return n.nextInt();
    }
    
    
    

}
