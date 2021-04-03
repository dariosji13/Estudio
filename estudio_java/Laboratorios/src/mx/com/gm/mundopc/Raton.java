package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {
	private final int idRaton;
	private static int contadorratones;

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton=++Raton.contadorratones;
	
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + ", "+super.toString()+ "]";
	}
	

}
