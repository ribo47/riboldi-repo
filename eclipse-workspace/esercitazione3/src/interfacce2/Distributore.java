package interfacce2;

public class Distributore {
	
	private String citta;
	private String proprietario;
	private double capacita;
	private double attuale;
	private double prezzo;


	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public double getCapacita() {
		return capacita;
	}


	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}


	public double getAttuale() {
		return attuale;
	}


	public void setAttuale(int attuale) {
		this.attuale = attuale;
	}


	public Distributore(String citta, String proprietario, double capacita, int attuale, double prezzo) {
		super();
		this.citta = citta;
		this.proprietario = proprietario;
		this.capacita = capacita;
		this.attuale = attuale;
		this.prezzo = prezzo;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double erogazione(double litri) {
		if(litri<this.attuale) {
			this.attuale=litri;
			return litri*prezzo;
		}
		return 0;
	}
}

