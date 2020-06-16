package esercitazione1_1;

import java.util.Scanner;

public class esercizio1 {
	
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int[] input = new int[5];
		for(int i=0; i<input.length;i++) {	
			System.out.println("Inserisci numero: "); 
			input[i] = scanner.nextInt();
		}
		ordinaArray(input);
		scanner.close();

	}

	private static void ordinaArray(int[] input) {
		
		int temp;
		for(int j=0; j<input.length-1; j++) 
		{
			for(int i=0; i<input.length-1; i++) 
			{
				if(input[i]>input[i+1])
				{
					temp=input[i+1];
					input[i+1]=input[i];
					input[i]=temp;
				}
			}
		}
		
		for(int i=0; i<input.length;i++) {	
			System.out.println("Array ordinato: ");
			System.out.println(input[i]); 

		}

	}
		
}

