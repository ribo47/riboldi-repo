package distributore;

import java.util.ArrayList;

public class Tessera {
	
	private int codice;
	private double credito;
	
	public int getCodice() {
		return codice;
	}
	
	public double getCredito() {
		return credito;
	}
	
	public double getCredito(int codice) {
		return credito;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
		
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public double leggiCredito(ArrayList<Tessera> t, int codice) {
		for (int i=0; i<t.size(); i++)  {
		    if(t.get(i).codice==codice) 
		    	return t.get(i).credito;	    	
		}
		return -1;	
	}
	
	public double caricaTessera(double credito, int codice) {
		
	    if(this.codice==codice) {
	    	setCredito((this.credito)+credito);
	    	return 1;
	    }		    	
		
		return -1;

	}
	public Tessera(int codice, double credito) {
		super();
		this.codice = codice;
		this.credito = credito;
	}
	

}
