import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Esercizio4 {
	public static void main (String[] args) {
		provaEx4();
	}
	
	public static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n) {
		LinkedList <LinkedList<Integer>> a = new LinkedList <LinkedList<Integer>>();
		for (int j=0; j<n; j++) {
			a.add(new LinkedList<Integer>());
			for(int i=0; i<=j; i++) {
				a.get(j).add(i);
			}
		}
		return a;
	}
	
	public static void stampa(LinkedList <LinkedList<Integer>> a) {
		for (Iterator i = a.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}
	
	public static void provaEx4() {
		/*  a. Il primo elemento della lista contiene una lista con il solo valore 0;
			b. Il secondo elemento contiene una lista con gli elementi 0 e 1
			c. Il terzo contiene una lista con gli elementi 0,1,2
			d. … e così via fino ad n-1*/
		LinkedList <LinkedList<Integer>> a = insiemeDiInsiemi(10);
		stampa(a);
	}
}
