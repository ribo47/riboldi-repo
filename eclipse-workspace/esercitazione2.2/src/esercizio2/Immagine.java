package esercizio2;

public class Immagine extends ElementoMultimediale implements Player, Luminosita{

	private int luminosita;
	
	public Immagine(String title, int luminosita) {
		super(title);
		this.luminosita=luminosita;
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}
	
	public String show() {
		String lum="";
		for(int i=0; i<this.getLuminosita(); i++) {
			lum=lum+("*");
		}
		return this.getTitle().concat(lum);
	}

}
