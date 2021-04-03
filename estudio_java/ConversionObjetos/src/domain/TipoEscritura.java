package domain;

public enum TipoEscritura {
	
	CLASICO("Escrtitura a Mano"),
	Moderna("Escrtitura a Digital");
	 private final String descripcion;
	 
	 private TipoEscritura(String descripcion) {
		 this.descripcion= descripcion;
	 }

	public String getDescripcion() {
		return this.descripcion;
	}

	 
    
}
