
package domain;


public class Pista extends Juego{
   private int idPista;
   
   private double largoPistaMetros;

    public Pista() {
    }
    

    public Pista(int idPista, double largoPistaKilometros) {
        this.idPista = idPista;
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
    
    

    @Override
    public String toString() {
        return "Pista{" + "idPista=" + idPista + ", largoPistaMetros=" + largoPistaMetros + '}';
    }
    
    
   
    /**
        * Retorna la longuitud en metros de un valor double en kilometos
        */  
  public double convetirKilometrosEnMetros(double largoPista){
      
       return largoPista*1000;
   }
   
    
   
}
