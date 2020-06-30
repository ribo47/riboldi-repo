package distributore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bevanda {
	
	private int codice;
	private String nome;
	private double prezzo;
	private String descrizione;
	
	public Bevanda(int codice, String nome, double prezzo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = "";
	}
	
	public Bevanda(int codice, String nome, double prezzo, String descrizione) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void aggiungiBevanda(String descrizione) {
		setDescrizione(descrizione);
	}

	public double getPrice(ArrayList<Bevanda> d, int codice) {
		 for (int i=0; i<d.size(); i++)  {
		    if(d.get(i).codice==codice) 
		    	return d.get(i).prezzo;	
		}

		return -1;
	}

	
	public String getName(ArrayList<Bevanda> d, int codice) {
		 for (int i=0; i<d.size(); i++)  {
		    if(d.get(i).codice==codice) 
		    	return d.get(i).nome;	
		}
		return "";
	}

	

}
