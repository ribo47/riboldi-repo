package esercizio1;
public class Prodotto {
	protected int barcode;
	protected String descrizione;
	protected double prezzo;
	
	public Prodotto(int barcode, String descrizione, double prezzo) {
		this.barcode = barcode;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	public Prodotto() {
	}

	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public void ApplicaSconto() {
		this.prezzo=this.prezzo*0.95;
	}
	
	public boolean equals(Prodotto p) {
		if(this.barcode==p.getBarcode() &&
				this.descrizione.equals(p.getDescrizione()) &&
				this.prezzo==p.getPrezzo())
			return true;
		return false;
	}
	
}
