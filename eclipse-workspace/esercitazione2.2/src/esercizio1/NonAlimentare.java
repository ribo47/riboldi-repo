package esercizio1;

public class NonAlimentare extends Prodotto{
	
	private String materiale;
	
	public NonAlimentare(int barcode, String descrizione, double prezzo, String materiale) {
		super(barcode, descrizione, prezzo);	
		this.materiale = materiale;}

	public NonAlimentare() {
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	public void appicaSconto(NonAlimentare n) {
		if(n.getMateriale().equals("plastica") || n.getMateriale().equals("carta") || n.getMateriale().equals("vetro"))
			this.prezzo=this.prezzo*0.90   ;

	}

}
