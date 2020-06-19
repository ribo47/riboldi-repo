package esercizo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
	
	private static final int numeroStagisti = 2;

	public static void main (String[] args) {
		
		String n=new String(), s=new String(), c, tc;
		int nop, id;
		
		Stagista[] arrayPersona=new Stagista[numeroStagisti];
		Scanner scanner = new Scanner(System.in);

		
		try {
	  
			for(int i=0; i<numeroStagisti; i++) {
				
				arrayPersona[i]= new Stagista();
				
				System.out.println("Inserisci i dati della persona:\nNome:");
				n = scanner.nextLine();
				arrayPersona[i].setName(n);

				System.out.println("Cognome:");
				s = scanner.nextLine();
				arrayPersona[i].setSurname(s);

				System.out.println("Città:");
				c = scanner.nextLine();
				arrayPersona[i].setCity(c);

				System.out.println("Codice fiscale:");
				tc = scanner.nextLine();
				arrayPersona[i].setTaxCode(tc);
				
				System.out.println("Numero ore:");
				nop = scanner.nextInt();
				arrayPersona[i].setNumberOfPresence(nop);

				System.out.println("id Stagista");
				id = scanner.nextInt();
				arrayPersona[i].setIdNumber(id);	
			}
			scanner.close();
		}
		catch (InputMismatchException e) {
	         System.out.println("Hai inserito un dato non valido  :" + e);
	     }
		
		
		int youngestIndex=0, temp=0, youngestAge=0;
		for(int i=0; i<numeroStagisti; i++) {
			temp=arrayPersona[i].bornYear(arrayPersona[i].getTaxCode());
			if(temp > youngestAge) {
				youngestAge=temp;
				youngestIndex=i;
			}
			
				
		}

		System.out.println("Il più giovane è "+arrayPersona[youngestIndex].getName()+" " + arrayPersona[youngestIndex].getSurname()+", "
				+arrayPersona[youngestIndex].getCity()+", "+arrayPersona[youngestIndex].getTaxCode()+", "
				+arrayPersona[youngestIndex].getNumberOfPresence()+", "+arrayPersona[youngestIndex].getIdNumber());
		
		System.out.println("Nato nel "+youngestAge);
	}
}
