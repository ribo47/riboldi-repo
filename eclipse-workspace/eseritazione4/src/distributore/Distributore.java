package distributore;

import java.util.ArrayList;

public class Distributore {
	
	protected ColonnaDistributore[] colonne = new ColonnaDistributore[4];

	public Distributore() {
		super();
		this.colonne[0] = new ColonnaDistributore();
		this.colonne[1] = new ColonnaDistributore();
		this.colonne[2] = new ColonnaDistributore();
		this.colonne[3] = new ColonnaDistributore();
	}
	
	public Distributore(ColonnaDistributore[] colonne) {
		super();
		this.colonne = colonne;
	}

	public ColonnaDistributore[] getcolonne() {
		return colonne;
	}
	
	public ColonnaDistributore getColonna(int i) {
		return this.colonne[i];
	}
	
	public void setColonne(ColonnaDistributore colonna, int i) {
		this.colonne[i]= colonna;

	}

	public void aggiornaColonna(int i, int numBevande, String tipo) {
		System.out.println(tipo);
		System.out.println(numBevande);

		setColonne(new ColonnaDistributore(tipo, numBevande), i); 		
	}
	
	public int lattineDisponibili(int i) {
		return this.getColonna(i).getNumBevande();
	}
	
	public int findTessera(int tessera, ArrayList<Tessera> t) {
		for(int i=0; i<t.size(); i++) {
			if(t.get(i).getCodice()==tessera)
				return i;
		}
		return -1;
	}

	public int eroga(int codice, int tessera, ArrayList<Tessera> t, ArrayList<Bevanda> b) {
		double credito = t.get(0).leggiCredito(t, tessera);
		String tipo;
		
		tessera=findTessera(tessera, t);
		if(tessera!=-1)
		{
			
			for(int i=0; i<4; i++) {
				tipo = (this.getColonna(i).getTipo());
				System.out.println(tipo);
				try {
					if(tipo.equals(b.get(codice).getNome())) {
						
						if(t.get(tessera).getCredito()<b.get(codice).getPrezzo())
							throw new CreditoInsuff("Credito insufficiente");
						if(this.getColonna(i).getNumBevande()<1)
							throw new BevandaEsaurita("Bevanda Esaurita");
						return i;
	
					}
				}			
				
				catch(IndexOutOfBoundsException npe) {			
				}
			}
		}
		return -1;
		
	}

}
