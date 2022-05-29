package inyeccion;

import pruebas.galletas;
import pruebas.tortas;
import pruebas.tartaletas;
import pruebas.masas;

public class articulosPasteleros {
	 
	 public galletas galletas;
	 public tortas tortas;
     private tartaletas tartaletas;
     private masas masas;
 
  public articulosPasteleros(pruebas.galletas galletas, pruebas.tortas tortas, pruebas.tartaletas tartaletas, pruebas.masas masas) {
	  super();
	  
	  this.galletas = galletas;
	  this.tortas = tortas;
	  this.tartaletas = tartaletas;
	  this.masas = masas;
	  }

public galletas getGalletas() {
	return galletas;
}

public void setGalletas(galletas galletas) {
	this.galletas = galletas;
}

public tortas getTortas() {
	return tortas;
}

public void setTortas(tortas tortas) {
	this.tortas = tortas;
}

public tartaletas getTartaletas() {
	return tartaletas;
}

public void setTartaletas(tartaletas tartaletas) {
	this.tartaletas = tartaletas;
}

public masas getMasas() {
	return masas;
}

public void setMasas(masas masas) {
	this.masas = masas;
}

@Override
public String toString() {
	return "articulosPasteleros [galletas=" + galletas + ", tortas=" + tortas + ", tartaletas=" + tartaletas
			+ ", masas=" + masas + "]";
}  
    
}   