package esercizo1;

public class Motorcycle extends Vehicle{

	protected int cc;
	
	public Motorcycle(String marca, String targa, String modello, boolean guasto, int cc) {
		super(marca, targa, modello, guasto);
		this.setCc(cc);
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getType() {
		
		return 2;
	}
}
