
package domain;


public class Caballo {
    
    private String nombreCaballo;
    
    private int IdCaballo;

    public Caballo() {
    }

    public Caballo(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }
    
    

    public Caballo(String nombreCaballo, int IdCaballo) {
        this.nombreCaballo = nombreCaballo;
        this.IdCaballo = IdCaballo;
    }

    public String getNombreCaballo() {
        return nombreCaballo;
    }

    public void setNombreCaballo(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    public int getIdCaballo() {
        return IdCaballo;
    }

    public void setIdCaballo(int IdCaballo) {
        this.IdCaballo = IdCaballo;
    }
    
    
}
