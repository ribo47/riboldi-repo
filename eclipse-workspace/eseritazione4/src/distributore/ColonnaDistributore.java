package distributore;

public class ColonnaDistributore{

	private String tipo;
	private int numBevande;

	public ColonnaDistributore(String tipo, int numBevande) {
		this.numBevande=numBevande;
		this.tipo=tipo;
	}
	
	public ColonnaDistributore() {
		
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumBevande() {
		return numBevande;
	}

	public void setNumBevande(int numBevande) {
		this.numBevande = numBevande;
	}

}
