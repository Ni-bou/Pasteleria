package pruebas;

public class tortas {

	private String sabores;
	private String bizcocho;
	private String crema;
	private String relleno;
	private String envoltorio;
	private String decoracion;
	private double precio;

	public tortas(String sabores, String bizcocho, String crema, String relleno, String envoltorio, String decoracion, double precio) {
      super();
      this.sabores = sabores;
      this.bizcocho = bizcocho;
      this.crema = crema;
      this.relleno = relleno;
      this.envoltorio = envoltorio;
      this.decoracion = decoracion;
      this.precio = precio;
}
	public String getSabores() {
	     return sabores;
	}	
    public void setSabores(String sabores) {
    	this.sabores = sabores;
    }  
      
    public String getBizcocho() {
    	 return bizcocho;
    } 
    public void setBizcocho(String bizcocho) {
    	 this.bizcocho = bizcocho;
    }
    public String getCrema() {
    	return crema;
    } 
   	public void setCrema(String crema) {
   	   this.crema = crema;
    }
   	public String getRelleno() {
	     return relleno;
	}	
    public void setRelleno(String relleno) {
   	   this.relleno = relleno;
    }
 	public String getEnvoltorio() {
	     return envoltorio;
	}	
    public void setEnvoltorio(String envoltorio) {
  	   this.envoltorio = envoltorio;
    }
    public String getDecoracion() {
		return decoracion;
	}
	public void setDecoracion(String decoracion) {
		this.decoracion = decoracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "tortas [sabores=" + sabores + ", bizcocho=" + bizcocho + ", crema=" + crema + ", relleno=" + relleno
				+ ", envoltorio=" + envoltorio + ", decoracion=" + decoracion + ", precio=" + precio + "]";
	}
   


}
