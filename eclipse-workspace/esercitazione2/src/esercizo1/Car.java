package esercizo1;

public class Car extends Vehicle{
	
	protected String tipologia;

	public Car(String marca, String targa, String modello, boolean guasto, String tipologia) {
		super(marca, targa, modello, guasto);
		this.setTipologia(tipologia);
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	public int getType() {
		
		return 1;
	}

}
