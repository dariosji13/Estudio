
package domain;


public class Carril extends Pista{
    
    private int idCarril;
    
    private double distanciaAvanada = 0;
    
    private double distanciaFaltante;

    public Carril() {
    }
    
    

    public Carril(int idCarril, double distanciaAvanada, double distanciaFaltante) {
        this.idCarril = idCarril;
        this.distanciaAvanada = distanciaAvanada;
        this.distanciaFaltante = distanciaFaltante;
        
    }

    public Carril(int idCarril, double distanciaAvanada, double distanciaFaltante, int idPista, double largoPistakilometros) {
        super(idPista, largoPistakilometros);
        this.idCarril = idCarril;
        this.distanciaAvanada = distanciaAvanada;
        this.distanciaFaltante = distanciaFaltante;
    }
    

    public int getIdCarril() {
        return idCarril;
    }

    public void setIdCarril(int idCarril) {
        this.idCarril = idCarril;
    }

    public double getDistanciaAvanada() {
        return distanciaAvanada;
    }

    public void setDistanciaAvanada(double distanciaAvanada) {
        this.distanciaAvanada = distanciaAvanada;
    }

    public double getDistanciaFaltante() {
        return this.distanciaFaltante;
    }

    public void setDistanciaFaltante(double distanciaFaltante) {
        this.distanciaFaltante = distanciaFaltante;
    }
    
    /*
    Metodo para calcular el avance en metros
    */

    public double avanceEnMetros(int valorDados){
        return this.distanciaAvanada+=(double)valorDados*100;
    }
    

    
    
}
