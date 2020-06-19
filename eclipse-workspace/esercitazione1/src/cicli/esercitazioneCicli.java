package cicli;

import java.util.Scanner;

public class esercitazioneCicli {
	
	public static void main (String[] args)
	{
		System.out.println("-------------------------1) Tutti i numeri inseriti sono pari -------------------"); 
		esLoop1();
		
		System.out.println("-------------------------2) Calcolo media dei multipli di 3 ---------------------"); 
		esLoop2();
		
		System.out.println("-------------------------3) 5 cicli di input/output ---------------------"); 
		esLoop3();
				
	}

	private static void esLoop3() {
		
		int i=0, i2=0, inputI, inputI2;
		Scanner scanner = new Scanner(System.in);

		while(i<3) {
			
			System.out.println("Quanti numeri vuoi inserire?"); 
			inputI = scanner.nextInt();
			i++;
			while(i2<inputI) {	
				System.out.println("Inserisci numero: "); 
				inputI2 = scanner.nextInt();
				System.out.println("Hai inserito "+inputI2); 
				i2++;
			}
			i2=0;	
		}
		System.out.println("Inserimento terminato"); 
		scanner.close();

	}

	private static void esLoop2() {
		System.out.println("Inserire -1 per terminare l'input"); 
		Scanner scanner = new Scanner(System.in);
		int num1, i=0;
		double media=0;
		
		do {
			 num1 = scanner.nextInt();
			 if(num1%3==0) {
				 media+=num1;
				 i++;
			 }
		}while(num1 != -1);
		
		
		System.out.println("Media: "+(media/i)); 
		scanner.close();
	}

	private static void esLoop1() {
		
		System.out.println("Inserire -1 per terminare l'input"); 
		Scanner scanner = new Scanner(System.in);
		int num1;
		
		do {
			 num1 = scanner.nextInt();
		}while(num1 != -1 && num1 %2 != 1);
		
		if(num1==-1)
			System.out.println("Tutti i numeri inseriti sono pari"); 
		else
			System.out.println("Hai inserito un numero dispari"); 
		scanner.close();


		
	}
	
	

}
