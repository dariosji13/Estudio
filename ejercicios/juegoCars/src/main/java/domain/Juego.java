
package domain;


public class Juego {
    
    private int idJuego;
    
    private int numeroJugadores;

    public Juego() {
    }

    public Juego(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public Juego(int idJuego, int numeroJugadores) {
        this.idJuego = idJuego;
        this.numeroJugadores = numeroJugadores;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "idJuego=" + idJuego + ", numeroJugadores=" + numeroJugadores + '}';
    }
        

    

  
    
}
