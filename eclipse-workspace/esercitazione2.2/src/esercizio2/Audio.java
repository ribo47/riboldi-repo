package esercizio2;

public class Audio extends ElementoMultimediale implements Player, Luminosita{

	private int durata;
	private int volume;
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume=volume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String play() {
		String vol="";

		for(int i=0; i<this.getVolume(); i++) {
			vol=vol+("*");

		}
		return this.getTitle().concat(vol);
	}

}
