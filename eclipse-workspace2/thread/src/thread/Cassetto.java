package thread;
class Cassetto {
	private int deposito;
	private int ultimoPrelievo=1;	

	public Cassetto(int deposito) {
		this.deposito = deposito;
		ultimoPrelievo=1;
	}

	public void preleva() {
		deposito = 0;
		ultimoPrelievo=0;
	}

	public void aggiungi(int somma) {
		deposito += somma;
	}

	public int getDeposito() {
		return deposito;
	}

	public int getUltimoPrelievo() {
		return ultimoPrelievo;
	}

	public void setUltimoPrelievo(int ultimoPrelievo) {
		this.ultimoPrelievo = ultimoPrelievo;
	}
}
