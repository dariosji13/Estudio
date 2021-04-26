
package domain;


public class Pista {
   private int idPista;
   
   private double largoPistaMetros;
   
   private double largoPistaKilometros;

    public Pista() {
    }

    public Pista(int idPista, double largoPistaKilometros) {
        this.idPista = idPista;
        this.largoPistaKilometros = largoPistaKilometros;
        this.largoPistaMetros = convetirKilometrosEnMetros(largoPistaKilometros);
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public double getLargoPistaMetros() {
        return largoPistaMetros;
    }

    public void setLargoPistaMetros(double largoPistaMetros) {
        this.largoPistaMetros = largoPistaMetros;
    }

    public double getLargoPistaKilometros() {
        return largoPistaKilometros;
    }

    public void setLargoPistaKilometros(double largoPistaKilometros) {
        this.largoPistaKilometros = largoPistaKilometros;
    }
    
     
   
    /**
        * Retorna la longuitud en metros de un valor double en kilometos
        */  
  public double convetirKilometrosEnMetros(double largoPistaKilometros){
      
       return largoPistaKilometros*1000;
   }

    @Override
    public String toString() {
        return "Pista{" + "idPista=" + idPista + ", largoPistaMetros=" + largoPistaMetros + ", largoPistaKilometros=" + largoPistaKilometros + '}';
    }
   
    
   
}
