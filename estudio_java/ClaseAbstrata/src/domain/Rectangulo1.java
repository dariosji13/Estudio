package domain;

public class Rectangulo extends FifuraGeometrica{
	
	public Rectangulo1 (String tipoFigura) {
		super(tipoFigura);
	}
	public Rectangulo(String tipoFigura) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void dibujar() {
		System.out.println("Se imprime "+ this.getClass().getSimpleName());
	}

}
