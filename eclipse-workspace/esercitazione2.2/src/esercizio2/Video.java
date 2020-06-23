package esercizio2;

public class Video extends ElementoMultimediale implements Player, Luminosita{

	private int durata;
	private int luminosita;
	private int volume;
	

	public Video(String titolo, int durata, int luminosita, int volume) {
		super(titolo);
		this.setDurata(durata);
		this.setLuminosita(luminosita);
		this.setVolume(volume);

	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public int getLuminosita() {
		return luminosita;
	}


	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String play() {
		String vol="";
		String lum="";
		
		for(int i=0; i<this.getVolume(); i++) {
			vol=vol+("*");
		}
		for(int i=0; i<this.getLuminosita(); i++) {
			lum=lum+("!");
		}
		return this.getTitle().concat(vol).concat("\n").concat(this.getTitle()).concat(lum);
	}

}
