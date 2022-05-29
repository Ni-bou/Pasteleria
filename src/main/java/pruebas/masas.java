package pruebas;

public class masas {

	private String tipoMasa;
	private String sabor;
	private String relleno;
	private String envoltio;
	public masas(String tipoMasa, String sabor, String relleno, String envoltio) {
		super();
		this.tipoMasa = tipoMasa;
		this.sabor = sabor;
		this.relleno = relleno;
		this.envoltio = envoltio;
	}
	public String getTipoMasa() {
		return tipoMasa;
	}
	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getRelleno() {
		return relleno;
	}
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	public String getEnvoltio() {
		return envoltio;
	}
	public void setEnvoltio(String envoltio) {
		this.envoltio = envoltio;
	}
	@Override
	public String toString() {
		return "masas [tipoMasa=" + tipoMasa + ", sabor=" + sabor + ", relleno=" + relleno + ", envoltio=" + envoltio
				+ "]";
	}
	
	
	
}
