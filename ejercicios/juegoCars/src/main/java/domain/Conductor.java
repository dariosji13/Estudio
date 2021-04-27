
package domain;


public class Conductor extends Jugador{
    
    private int idConductor;
     

    public Conductor() {
    }

    public Conductor(int idConductor, int idJugador, String nombreJugador, int cantidadJuegosGanados) {
        super(idJugador, nombreJugador, cantidadJuegosGanados);
        this.idConductor = idConductor;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    @Override
    public String toString() {
        return "Conductor{" + "idConductor=" + idConductor + '}';
    }

 
    
   
    
}
