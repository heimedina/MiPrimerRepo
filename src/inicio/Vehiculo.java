package inicio;

public class Vehiculo {
	
	String modelo;
	int nroRuedas;
	public Vehiculo(String modelo, int nroRuedas) {
		super();
		this.modelo = modelo;
		this.nroRuedas = nroRuedas;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setNroRuedas(int nroRuedas) {
		this.nroRuedas = nroRuedas;
	}
	public String getModelo() {
		return modelo;
	}
	public int getNroRuedas() {
		return nroRuedas;
	}
	
	
}
