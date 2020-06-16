package array;

public class esercitazioneArray {
	
	

	public static void main (String[] args)
	{
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		int[] array2 = new int[10];
		String[] array3 = {"mela", "pera", "arancia", "anguria", "pompelmo"};
		String[] array4 = {"roma", "milano", "brescia", "monza", "lecco"};
	
		System.out.println("-------------------------1) Stampa array in ordine stabilito -------------------");
		esArray1(array1);	//stampa un array nell'ordine primo, ultiumo, secondo, penultimo,..
		
		System.out.println("-------------------------2) Conteggio pari e dispari ----------------------------");
		esArray2(array2);	//array randomico, calcolo di parità fra numeri pari e dispari
		
		System.out.println("-------------------------3) Ricerca 3 numeri uguali consecutivi  ----------------");
		boolean resultEs3 = esArray3(array2);	//array randomico, ricerca 3 numeri uguali consecutivi
		if(resultEs3==true)
			System.out.println("Tre valori consecutivi uguali");
		else
			System.out.println("NO");
		
		System.out.println("-------------------------4) Confronto fra array di stringhe----------------------");
		boolean resultEs4=esArray4(array3, array4);	//array randomico, calcolo di parità fra numeri pari e dispari
		if(resultEs4==true)
			System.out.println("OK");
		else
			System.out.println("KO");

	}


	private static void esArray1(int[] array) {
		
		for(int i=0, j=array.length-1; i<=j; i++, j--) {
			System.out.println("elemento numero "+(i+1)+" = "+array[i]);
			System.out.println("elemento numero "+(j+1)+" = "+array[j]);
		}
		
	}
	
	
	private static void esArray2(int[] array) {
		int contP=0, contD=0;
		int min=0, max=30;
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random() * (max - min + 1) + min);;
			if(array[i]%2==0)
				contP++;
			else
				contD++;
			
		}
		if(contP==contD)
			System.out.println("Pari e dispari uguali");
		else
			System.out.println("Pari e dispari diversi");
			
	}
	
	private static boolean esArray3(int[] array) {
		for(int i=0; i<array.length; i++) {
			if(i>=2) {
				if(array[i-1]==array[i] && array[i-2]==array[i])
					return true;
			}
		}
		return false;
	}
	
	private static boolean esArray4(String[] array3, String[] array4) {
		
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array4.length;j++) {
				if(array3[i]==array4[j])
					return true;
			}
		}
		return false;
		
		
	}
}
