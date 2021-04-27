package presentacio;

import domain.*;
import java.util.*;

public class PruebaJuego {
    
   static MenuJuego menuJuego = new MenuJuego();

    public static void main(String[] args) {
        
        int numeroJugadores = 0;
        double largoPista = 0;
        
//        menuJuego.leerNumeroEntero();
         menuJuego.menuDeBienvenidadYOpciones();
        if(menuJuego.leerNumeroEntero()== 1){
            menuJuego.menuNumeroDeJugadores();
            numeroJugadores = menuJuego.leerNumeroEntero();
            menuJuego.menuLargoPista();
            largoPista = menuJuego.leerNumeroDouble();
            
            Escuderia [] listaEscuderia= new Escuderia[numeroJugadores];
            
            for(int i= 0; i< numeroJugadores;i++){
                Carril carril = new Carril();
                carril.setLargoPistaKilometros(largoPista);
                carril.setIdCarril(i);
                carril.setIdPista(i);
                
                
                Conductor conductor = new Conductor();
                menuJuego.mensajeNombreJugador();
                conductor.setNombreJugador(menuJuego.leerString());
                conductor.setIdConductor(i);
                conductor.setIdJugador(i);
                
                
                
                Carro carro = new Carro();
                menuJuego.mansajeColorCarro();
                carro.setColor(menuJuego.leerString());
                carro.setIdCarro(i);
                
               listaEscuderia[i] = new Escuderia(conductor, carril, carro);
                
               
        }
            
            System.out.println(listaEscuderia[1].getConductor().getNombreJugador());
            System.out.println(listaEscuderia[1].getCarro().getColor());
          
        }
    }
    
}
