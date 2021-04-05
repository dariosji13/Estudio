package domain;

public abstract class FifuraGeometrica {
	protected String tipoFigura;
	
	protected  FifuraGeometrica(String tipoFigura) {
		this.tipoFigura=tipoFigura;		
	}
	public abstract void dibujar();
	public String getTipoFigura() {
		return tipoFigura;
	}
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	@Override
	public String toString() {
		return "FifuraGeometrica [tipoFigura=" + tipoFigura + "]";
	}
	
	
		
	

}
