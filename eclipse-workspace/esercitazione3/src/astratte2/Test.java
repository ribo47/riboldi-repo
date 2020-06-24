package astratte2;

public class Test {
	
	public static void main (String[] args) {
		Dado d = new Dado(6);
		Moneta m = new Moneta();
		
		System.out.println("Lanci con l'ausilio della classe astratta");
		System.out.println("Dado " +d.lancio());
		System.out.println("Moneta " +m.lancio());
		System.out.println("Lanci senza ausilio della classe astratta");
		System.out.println("Dado " +d.lancio2());
		System.out.println("Moneta " +m.lancio2());

	}


}
