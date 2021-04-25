
package domain;


public class Carril extends Pista{
     private int idCarril;
     
     private String nombre;

    public Carril() {
    }
     

    public Carril(int idCarril) {
        this.idCarril = idCarril;
    }

    public Carril(String nombre) {
        this.nombre = nombre;
    }

    public Carril(String nombre, int idPista, double largoPistaKilometros) {
        super(idPista, largoPistaKilometros);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carril{" + "idCarril=" + idCarril + ", nombre=" + nombre +" "+super.toString()+ '}';
    }

    

    
    

}
