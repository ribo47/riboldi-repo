package esercizio2;

import java.util.Scanner;

public class LettoreMultimediale {
	
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		ElementoMultimediale[] elementi= new ElementoMultimediale[5];
		String tipo=null, titolo=null;
		int durata, luminosita, volume;

		
		for(int i=0; i<5; i++) {
			
			System.out.println("Inserisci a per memorizzare un audio, v per un video e i per un'immagine");
			tipo=scanner.nextLine();
			System.out.println(tipo);

			if(tipo.equals("a")) {
				System.out.println("Inserisci titolo dell'audio");
				titolo=scanner.nextLine();
				System.out.println("Inserisci durata dell'audio");
				durata=scanner.nextInt();
				System.out.println("Inserisci volume dell'audio");
				volume=scanner.nextInt();
				elementi[i]=new Audio(titolo, durata, volume);
			}
					
			
			else if(tipo.equals("v")) {
				System.out.println("Inserisci titolo del video");
				titolo=scanner.nextLine();
				System.out.println("Inserisci durata del video");
				durata=scanner.nextInt();
				System.out.println("Inserisci luminosita del video");
				luminosita=scanner.nextInt();
				System.out.println("Inserisci volume del video");
				volume=scanner.nextInt();
				elementi[i]=new Video(titolo, durata, luminosita, volume);
				
			}
			else if(tipo.equals("i")) {
				System.out.println("Inserisci titolo dell'immagine");
				titolo=scanner.nextLine();
				System.out.println("Inserisci luminosità dell'immagine");
				luminosita=scanner.nextInt();
				elementi[i]=new Immagine(titolo, luminosita);
				
			}
			else {
				System.out.println("Input errato"); 
				i--;
			}
		}
		
		int loop=0, index=0, scelta=0;
		
		System.out.println("A quale dei 5 elementi vuoi accedere? 0 per terminare");
		index=(scanner.nextInt())-1;
		
		
		
		while(index!=-1) {
			
			try {
				System.out.println(((Audio) elementi[index]).play());
				
			}catch(ClassCastException np) {
				try {
					System.out.println(((Video) elementi[index]).play());
					
				}catch(ClassCastException np2) {
					System.out.println(((Immagine) elementi[index]).show());
				}
			}
			
			
			System.out.println("1 per alzare il volume, 2 alzare la luminosita, 3 per diminuire il volume e 4 per la luminoista 0 per il prossimo elemento");
			scelta=scanner.nextInt();
			
			
			if(scelta==1) {
				Player.louder(elementi[index]);
			}
			
			if(scelta==2) {	
				Luminosita.brighter(elementi[index]);
			}
			
			if(scelta==3) {
				Player.weaker(elementi[index]);
			}
			
			if(scelta==4) {	
				Luminosita.lighter(elementi[index]);
			}
			
			System.out.println("A quale dei 5 elementi vuoi accedere? 0 per terminare");
			index=(scanner.nextInt())-1;
		}
		
		scanner.close();

	}
}
