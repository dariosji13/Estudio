package domain;

public class Empleado  extends Persona{
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado() {
		this.idEmpleado= ++ Empleado.contadorEmpleado;
	}
	public Empleado(String nombre, double sueldo) {
		//super(nombre);
		this();
		this.nombre= nombre;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(idEmpleado);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append("]");
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
