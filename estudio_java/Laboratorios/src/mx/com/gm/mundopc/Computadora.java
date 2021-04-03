package mx.com.gm.mundopc;

public class Computadora {
	private String nombre;
	private final int idComputadora;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadora;
	
	private Computadora() {
		this.idComputadora=++Computadora.contadorComputadora;
	}
	public  Computadora (String nombre,Monitor monitor, Teclado teclado,Raton raton) {
		this();
		this.nombre= nombre;
		this.monitor=monitor;
		this.teclado=teclado;
		this.raton=raton;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdComputadora() {
		return this.idComputadora;
	}
	public Monitor getMonitor() {
		return this.monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Teclado getTeclado() {
		return this.teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public Raton getRaton() {
		return this.raton;
	}
	public void setRaton(Raton raton) {
		this.raton = raton;
	}
	@Override
	public String toString() {
		return "Computadora [nombre=" + nombre + ", idComputadora=" + idComputadora + ", monitor=" + monitor
				+ ", teclado=" + teclado + ", raton=" + raton + "]";
	}
	
	
	

}
