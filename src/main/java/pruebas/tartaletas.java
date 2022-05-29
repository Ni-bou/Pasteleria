package pruebas;

public class tartaletas {

	private String base;
	private String relleno;
	private String sabor;
	private String decoracion;
	private String envoltio;
	public tartaletas(String base, String relleno, String sabor, String decoracion, String envoltio) {
		super();
		this.base = base;
		this.relleno = relleno;
		this.sabor = sabor;
		this.decoracion = decoracion;
		this.envoltio = envoltio;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getRelleno() {
		return relleno;
	}
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getDecoracion() {
		return decoracion;
	}
	public void setDecoracion(String decoracion) {
		this.decoracion = decoracion;
	}
	public String getEnvoltio() {
		return envoltio;
	}
	public void setEnvoltio(String envoltio) {
		this.envoltio = envoltio;
	}
	@Override
	public String toString() {
		return "tartaletas [base=" + base + ", relleno=" + relleno + ", sabor=" + sabor + ", decoracion=" + decoracion
				+ ", envoltio=" + envoltio + "]";
	}
	
	

}
