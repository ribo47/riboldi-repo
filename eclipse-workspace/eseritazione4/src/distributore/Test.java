package distributore;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		ArrayList<Bevanda> b =new ArrayList<Bevanda>();
		ArrayList<Tessera> t = new ArrayList<Tessera>();
		Distributore d = new Distributore();
		
		
		int codice = 1, numBevande;
		double prezzo = -1, credito=5;
		String nome, descrizione;
		
		
		System.out.println("Inserisci codice bevanda (per terminare scrivi 0)");
		codice = (scanner.nextInt());

		while(codice>0) {
			
			System.out.println("Nome");
			nome = (scanner.next());
			System.out.println("Prezzo");
			prezzo = (scanner.nextDouble());
			b.add(new Bevanda (codice, nome, prezzo));
			System.out.println("Inserita!");
			
			codice = (scanner.nextInt());

		}
		
		int bevanda=1;
		codice=1;
		System.out.println("Richiedi bevanda, 0 per uscire");
		System.out.println("Codice");
		codice = (scanner.nextInt());
		while(codice>0) {
			
			
			prezzo=b.get(0).getPrice(b, codice);
			nome=b.get(0).getName(b, codice);
			if(prezzo==-1||nome.equals(""))
				throw new BevandaNonValida("Codice non trovato");
			else
				System.out.println("Bevanda trovata, costo "+prezzo+"€, nome: "+nome);
			System.out.println("Codice");
			codice = (scanner.nextInt());
		}
		
		t.add(new Tessera(1, 10));
		t.add(new Tessera(2, 12));
		t.add(new Tessera(3, 0));
		/*
		codice=1;
		System.out.println("Ricarica tessera. Inserisci codice, 0 per uscire");
		System.out.println("Codice");
		codice = (scanner.nextInt());
		while(codice>0) {
				
			for (int i=0; i<t.size(); i++)  {
				System.out.println("for");
				prezzo=t.get(i).caricaTessera(credito, codice);
				if(prezzo!=-1)
					break;
			}
			if(prezzo==-1)
				throw new BevandaNonValida("Codice non trovato");
			else
				System.out.println("Tessera ricaricata: credito residuo "+t.get(0).leggiCredito(t, codice)+"€");
			System.out.println("Codice");
			codice = (scanner.nextInt());
		}*/
		
		System.out.println("Inserisci colonna di bevanda (per terminare scrivi 0)");
		System.out.println("Colonna numero: ");
		codice = (scanner.nextInt())-1;
		while(codice>-1) {
			if(codice<3) {
				
				System.out.println("Nome bevanda: ");
				nome = (scanner.next());
				System.out.println("Numero bevanda: ");
				numBevande = (scanner.nextInt());
				d.setColonne(new ColonnaDistributore(nome, numBevande), codice);
				
				System.out.println("Colonna "+codice +": "+d.getColonna(codice).getTipo()+", "+d.getColonna(codice).getNumBevande());
				
				System.out.println("Colonna numero: ");
				codice = (scanner.nextInt())-1;
			}
		}
		
		System.out.println("Richiedi colonna (per terminare scrivi 0)");
		System.out.println("Colonna numero: ");
		codice = (scanner.nextInt())-1;
		while(codice>-1) {
			if(codice<3) {
				System.out.println("Colonna "+codice +" "+d.getColonna(codice).getNumBevande());
				System.out.println("Colonna numero: ");
				codice = (scanner.nextInt())-1;
			}
		}
		int colonnaIndex=0;
		while(true) {
		
			System.out.println("Eroga: \nCodice");
			codice = (scanner.nextInt());
			System.out.println("Tessera");
			int tessera = (scanner.nextInt());
			colonnaIndex=d.eroga(codice-1, tessera, t, b);
			if(colonnaIndex!=-1) {
				System.out.println("Bevanda presente nella colonna "+colonnaIndex+1);
			}
		}
		
	}

}
