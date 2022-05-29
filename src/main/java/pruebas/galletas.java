package pruebas;

public class galletas {
	
	private String sabores;
	private String tamanio;
	private String colores;
	private int cantidades;
	private String disenio;
	private String envoltorio;
	private double precio;
	
	public galletas(String sabores, String tamanio, String colores, int cantidades, String disenio, String envoltorio, double precio) {
		super();
		this.sabores = sabores;
		this.tamanio = tamanio;
		this.colores = colores;
		this.cantidades = cantidades;
		this.disenio = disenio;
		this.envoltorio = envoltorio;
		this.precio = precio;
	}

	public String getSabores() {
		return sabores;
	}

	public void setSabores(String sabores) {
		this.sabores = sabores;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getColores() {
		return colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

	public int getCantidades() {
		return cantidades;
	}

	public void setCantidades(int cantidades) {
		this.cantidades = cantidades;
	}

	public String getDisenio() {
		return disenio;
	}

	public void setDisenio(String disenio) {
		this.disenio = disenio;
	}

	public String getEnvoltorio() {
		return envoltorio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}


	@Override
	public  String toString() {
		return "galletas [sabores=" + sabores + ", tamanio=" + tamanio + ", colores=" + colores + ", cantidades="
				+ cantidades + ", disenio=" + disenio + ", envoltorio=" + envoltorio +", precio=" + precio +"]";
	}
 
	

}
