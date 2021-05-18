
package domain;


public class Jugador extends Persona{
    
    private float dineroActual = 20000;
    
    private float dineroApostado;
    
    private boolean tieneDinero = true;
    
    Caballo caballo;

    public Jugador() {
    }

    public Jugador(String nombre) {
        super(nombre);
    }

    public Jugador(float dineroApostado, String nombre) {
        super(nombre);
        this.dineroApostado = dineroApostado;
    }
    

    public Jugador(float dineroApostado, Caballo caballo, String nombre) {
        super(nombre);
        this.dineroApostado = dineroApostado;
        this.caballo = caballo;
    }

    public boolean isTieneDinero() {
        return tieneDinero;
    }

    public void setTieneDinero(boolean tieneDinero) {
        this.tieneDinero = tieneDinero;
    }

       

    public float getDineroActual() {
        return dineroActual;
    }

    public void setDineroActual(float dineroActual) {
        this.dineroActual = dineroActual;
    }

    public float getDineroApostado() {
        return dineroApostado;
    }

    public void setDineroApostado(float dineroApostado) {
        if (dineroApostado <= this.dineroActual){
              this.dineroApostado = dineroApostado;
          }
        else{
            this.dineroApostado = this.dineroActual;
        
        }
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }
    
    
  
      public  void actulizarDineroActual (){
          this.dineroActual -= this.dineroApostado;
          if (this.dineroActual < 0){
              this.dineroActual=0;
          }
        
    }
    
    

   
   
    
}
