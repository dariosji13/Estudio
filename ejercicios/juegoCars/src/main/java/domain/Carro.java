package domain;

public class Carro {

    private int idCarro;

    private Carril carril;

    private String color;
    
    private double distanciaAvanzadaMetros;

    public Carro(int idCarro, Carril carril, String color) {
        this.idCarro = idCarro;
        this.carril = carril;
        this.color = color;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public Carril getCarril() {
        return carril;
    }

    public void setCarril(Carril carril) {
        this.carril = carril;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistanciaAvanzadaMetros() {
        return distanciaAvanzadaMetros;
    }

    public void setDistanciaAvanzadaMetros(double distanciaAvanzadaMetros) {
        this.distanciaAvanzadaMetros = distanciaAvanzadaMetros;
    }

    @Override
    public String toString() {
        return "Carro{" + "idCarro=" + idCarro + ", carril=" + carril + ", color=" + color + ", distanciaAvanzadaMetros=" + distanciaAvanzadaMetros + '}';
    }
      
      

}
