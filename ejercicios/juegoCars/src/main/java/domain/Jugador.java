
package domain;


public class Jugador {
    
   private int idJugador;
   
   private String nombreJugador;
   
   private int valorDado;
   
   private int cantidadJuegosGanados;
   
   
    public Jugador() {
    }

    public Jugador(int idJugador, String nombreJugador, int cantidadJuegosGanados) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.cantidadJuegosGanados = cantidadJuegosGanados;
    }

   

    public Jugador(int valorDado) {
        this.valorDado = valorDado;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getValorDado() {
        return valorDado;
    }

    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }

    public int getCantidadJuegosGanados() {
        return cantidadJuegosGanados;
    }

    public void setCantidadJuegosGanados(int cantidadJuegosGanados) {
        this.cantidadJuegosGanados = cantidadJuegosGanados;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + ", valorDado=" + valorDado + ", cantidadJuegosGanados=" + cantidadJuegosGanados + '}';
    }

  
    
}
