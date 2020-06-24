package astratte2;

public class Moneta extends Lancio{
	
	private int numeroFacce;

	public Moneta() {
		super();
		this.numeroFacce = 2;
	}

	protected int lancio() {
		
		return (int)(Math.random() * (this.numeroFacce))+1;
	}

	public int getNumeroFacce() {
		return numeroFacce;
	}

	public void setNumeroFacce(int numeroFacce) {
		this.numeroFacce = numeroFacce;
	}

	public int lancio2() {
		return (int)(Math.random() * (this.numeroFacce))+1;
	}

}