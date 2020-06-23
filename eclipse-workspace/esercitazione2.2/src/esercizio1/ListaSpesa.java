package esercizio1;

import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaSpesa {
	
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int y,m,d, barcode;
		double prezzo, totale=0;
		

		System.out.println("Hai la tessera fedeltà? (s/n)");
		String tessera=scanner.next();		
		String tipo = null;
		System.out.println("Inserisi barcode, nome prodotto, prezzo. Data di scadenza o materiale ove possibile/nSepara ogni campo con invio");

		do {
			try {
				System.out.println("Barcode:");
				barcode=(scanner.nextInt());
				System.out.println("Nome prodotto: ");
				String nomeProdotto=scanner.next();
				System.out.println("Prezzo: ");
				prezzo=(scanner.nextDouble());
				
				System.out.println("E' un genere alimentare? (s/n)");
				tipo=scanner.next();
				if(tipo.equals("s")) {
					System.out.println("Giorno scadenza");
					d=scanner.nextInt();
					System.out.println("Mese scadenza");
					m=scanner.nextInt();
					System.out.println("Anno scadenza");
					y=scanner.nextInt();
					Alimentare prodottoA=new Alimentare(10, "nomeProdotto", prezzo, LocalDate.of(y, m, d));
					if(tessera.equals("s"))  {
						totale+= prodottoA.applicaSconto();
						System.out.println("Totale spesa parziale: "+totale);
					}
					else
						totale+=prezzo;
				}
				
				else {
					System.out.println("Materiale principale");
					String materiale=scanner.next();
					Prodotto prodottoNA=new NonAlimentare(10, "nomeProdotto", prezzo, materiale);
					if(tessera.equals("s")) {
						if(materiale.equals("carta") || materiale.equals("vetro") || materiale.equals("plastica"))
							totale+=prezzo*0.9;
						else
							totale+=prezzo;
					}
					
				}
				System.out.println("Scrivi s per inserire un altro prodotto");
				tipo=scanner.next();
				
			}
			
			catch(InputMismatchException e) {
				System.out.println("Errore nell'inserimento dati");
		        scanner.nextLine();
			}
				
			
		}while(tipo.equals("s"));
		
		System.out.println("Totale spesa: "+totale);

	}

}
