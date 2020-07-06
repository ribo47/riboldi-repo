import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Esercizio3 {
	public static void main (String[] args) {
		provaEx3();
	}
	
	public static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b){
		LinkedList<Integer> lista=new LinkedList<Integer>();
		for (Iterator i = a; i.hasNext();) {
			   lista.add((Integer) i.next());
		}
		for (Iterator i = b; i.hasNext();) {
			   lista.add((Integer) i.next());
		}
		Collections.sort(lista);
		return 	lista; 

	}
	
	public static void provaEx3() {
		LinkedList<Integer> lista1=new LinkedList<Integer>();
		LinkedList<Integer> lista2=new LinkedList<Integer>();

		int item;
        Random ran = new Random();

		for(int i=0; i<10; i++) {
        	item = ran.nextInt(20); 
    		lista1.add(item);
        	item = ran.nextInt(20); 
    		lista2.add(item);
        }
		
		Iterator a= lista1.iterator();
		Iterator b= lista2.iterator();
		
		for (Iterator i = lista1.iterator(); i.hasNext();) {
			System.out.print(i.next()+" - ");
		}
		System.out.println("");

		for (Iterator i = lista2.iterator(); i.hasNext();) {
			System.out.print(i.next()+" - ");
		}
		System.out.println("");

		lista1=mergeOrdinato(a, b);
		for (Iterator i = lista1.iterator(); i.hasNext();) {
			System.out.print(i.next()+" - ");
		}
	}

}