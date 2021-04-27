
package domain;

public class Escuderia {
    Conductor conductor;
    Carril carril;
    Carro carro;

    public Escuderia() {
    }

    public Escuderia(Conductor conductor, Carril carril, Carro carro) {
        this.conductor = conductor;
        this.carril = carril;
        this.carro = carro;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Carril getCarril() {
        return carril;
    }

    public void setCarril(Carril carril) {
        this.carril = carril;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

  
    
    
    
}
