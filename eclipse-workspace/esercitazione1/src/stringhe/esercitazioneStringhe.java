package stringhe;

public class esercitazioneStringhe {
	
	

	public static void main (String[] args)
	{
		String string1 = "Viva java";
		String[] arrayString= {"Mela", "pera", "Arancia", "anguria", "pompelmo", ""};
		
		
		System.out.println("-------------------------1) Stampa di una stringa al contrario -------------------");
		esString1(string1);
		
		System.out.println("-------------------------2) Stampa delle vocali di una stringa -------------------");
		esString2(string1);
		
		System.out.println("-------------------------3) Calcolo lunghezza stringhe che iniziano per maiuscola-");
		int totLength = esString3(arrayString);
		System.out.println(totLength);
		
		
	}

	private static int esString3(String[] arrayString) {
		
		int lengthCount=0;
		for(int i=0; arrayString[i]!=""; i++) {
			if(arrayString[i].charAt(0)<=90 && arrayString[i].charAt(0)>=65)
				lengthCount+=arrayString[i].length();
		}
		return lengthCount;
		
	}

	private static void esString2(String string1) {
		
		string1=string1.toLowerCase();
		
		for(int i=0; i<string1.length(); i++) {
			if(string1.charAt(i) == 'a' || string1.charAt(i) == 'e' || string1.charAt(i) == 'i' || string1.charAt(i) == 'o' ||string1.charAt(i) == 'u')
				System.out.print(string1.charAt(i));
		}
		System.out.println("");
		
	}

	private static void esString1(String string1) {
		for(int i=string1.length()-1; i>=0; i--) {
			System.out.print(string1.charAt(i));
		}
		System.out.println("");

	}

}
