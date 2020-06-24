package interfacce2;

import java.util.Scanner;

public class Test implements Comparable{

	public static void main(String[] args) {
		Distributore[] distributori= new Distributore[2];
		
		distributori[0]= new Distributore("milano", "franco", 1000, 1300, 1.350);
		distributori[1]= new Distributore("roma", "mario", 4000, 1300, 1.290);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Erogazione 50 litri da distributore di milano");
		System.out.println(distributori[0].erogazione(150) + " €");
		
		System.out.println("Erogazione 100 litri da distributore di milano");
		System.out.println(distributori[1].erogazione(100) + " €");

		System.out.println("Il distributore più capiente è di "+Comparable.compara(distributori[0], distributori[1]).getProprietario());

	}

}
