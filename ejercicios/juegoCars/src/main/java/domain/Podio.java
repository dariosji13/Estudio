
package domain;

import java.util.*;


public class Podio extends Juego{
     
    private int idPodio;
    
    private String primero;
    
    private String segungo;
    
    private String tercero;
        
    private List<Juego> jugadores;

    public Podio() {
    }

    public Podio(int idPodio) {
        this.idPodio = idPodio;
    }

    public Podio(String primero) {
        this.primero = primero;
    }

    public Podio(List<Juego> jugadores) {
        this.jugadores = jugadores;
    }

    public Podio(int idJuego,String primero, String segungo, String tercero) {
        super(idJuego);
        this.primero = primero;
        this.segungo = segungo;
        this.tercero = tercero;
    }

    public Podio(int idPodio, String primero, String segungo, String tercero, List<Juego> jugadores) {
        this.idPodio = idPodio;
        this.primero = primero;
        this.segungo = segungo;
        this.tercero = tercero;
        this.jugadores = jugadores;
    }
    
    
    
    
}
