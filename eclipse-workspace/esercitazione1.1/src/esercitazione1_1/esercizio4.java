package esercitazione1_1;

import java.util.Scanner;

public class esercizio4 {
	
	public static void main (String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[3][4];
		
		System.out.println("Inserisci una matrice 3x4 (in orizzontale) "); 
		for(int j=0; j<4; j++) 
		{
			for(int i=0; i<3; i++) 
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		trasposta(matrix);

		scanner.close();

		
	}

	private static void trasposta(int[][] matrix) {
		
		System.out.println("Matrice inserita"); 
		for(int j=0; j<4; j++) 
		{
			for(int i=0; i<3; i++) 
			{
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println("");
		}
		
		System.out.println("Matrice traslata"); 
		for(int j=0; j<3; j++) 
		{
			for(int i=0; i<4; i++) 
			{
				System.out.print(matrix[j][i]+"  ");
			}
			System.out.println(""); 

		}
		
	}

}
