package domain;
import java.util.Date;

public class Cliente extends Persona{
	private int idCliente;
	public static int contadorCliente;
	private boolean vip;
	private Date fechaResgistro;
	public Cliente(String nombre, char genero, int edad, String direccion,  boolean vip,
			Date fechaResgistro) {
		super(nombre, genero, edad, direccion);
		this.idCliente = ++Cliente.contadorCliente;
		this.vip = vip;
		this.fechaResgistro = fechaResgistro;
	}
	public int getIdCliente() {
		return this.idCliente;
	}
	
	public boolean isVip() {
		return this.vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public Date getFechaResgistro() {
		return this.fechaResgistro;
	}
	public void setFechaResgistro(Date fechaResgistro) {
		this.fechaResgistro = fechaResgistro;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", fechaResgistro=");
		builder.append(fechaResgistro);
		builder.append("]");
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	

}
