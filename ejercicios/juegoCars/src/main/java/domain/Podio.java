
package domain;

import java.util.*;


public class Podio extends Juego{
     
    private int idPodio;
    
    private String primero;
    
    private String segungo;
    
    private String tercero;

    public Podio() {
    }
    
    
    
    public Podio(int idPodio, String primero, String segungo, String tercero, int idJuego) {
        super(idJuego);
        this.idPodio = idPodio;
        this.primero = primero;
        this.segungo = segungo;
        this.tercero = tercero;
    }

    public Podio(String primero, String segungo, String tercero, int idJuego) {
        super(idJuego);
        this.primero = primero;
        this.segungo = segungo;
        this.tercero = tercero;
    }
    

    public int getIdPodio() {
        return idPodio;
    }

    public void setIdPodio(int idPodio) {
        this.idPodio = idPodio;
    }

    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegungo() {
        return segungo;
    }

    public void setSegungo(String segungo) {
        this.segungo = segungo;
    }

    public String getTercero() {
        return tercero;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    @Override
    public String toString() {
        return "Podio{" + "primero=" + primero + ", segungo=" + segungo + ", tercero=" + tercero + '}';
    }
    
         
    
}
