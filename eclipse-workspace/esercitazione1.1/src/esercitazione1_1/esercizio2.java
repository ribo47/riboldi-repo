package esercitazione1_1;

import java.util.Scanner;

public class esercizio2 {
	
	public static void main (String[] args)
	{

		Scanner scanner = new Scanner(System.in);

		String input = new String();	
		System.out.println("Inserisci una stringa: "); 
		input = scanner.nextLine();
	
		if(isPalindroma(input))
			System.out.println("La stringa è palindroma"); 
		else
			System.out.println("La stringa non è palindroma"); 

		scanner.close();

	
		
	}

	private static boolean isPalindroma(String input) {
		
		for(int i=0, j=input.length()-1; i<=j; i++,j--) {	
			if(input.charAt(i)!=input.charAt(j))
				return false;
		}
		return true;
	}


}
