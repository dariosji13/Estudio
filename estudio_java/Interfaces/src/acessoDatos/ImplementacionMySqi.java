package acessoDatos;

public class ImplementacionMySqi implements IAccesoDatos{

	@Override
	public void insertar() {
		System.out.println("Insertar desde Mysql");
		
	}

	@Override
	public void listar() {
		System.out.println("Listar desde Mysql");
		
	}

	@Override
	public void actualizar() {
		System.out.println("ActualiR desde Mysql");
		
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar desde Mysql");
		
	}

}
