package esercizo1;

public class Vehicle {
	
	private String marca;
	private String targa;
	private String modello;
	private boolean guasto;
	
	public Vehicle(String marca, String targa, String modello, boolean guasto) {
		this.marca=marca;
		this.targa=targa;
		this.modello=modello;
		this .guasto=guasto;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public boolean isGuasto() {
		return guasto;
	}
	public void setGuasto(boolean guasto) {
		this.guasto = guasto;
	}
	
	

}
