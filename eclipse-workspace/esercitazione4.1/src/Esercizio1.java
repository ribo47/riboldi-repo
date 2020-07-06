import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
public class Esercizio1 {
	
	public static void main (String[] args) {
		LinkedList<Integer> lista = creaRandom(20, 100);
		Iterator iterator = lista.iterator();
		stampa(iterator, lista);
		System.out.println("");

		ArrayList<Integer> lista2 = creaRandom2(20, 100);
		iterator = lista2.iterator();
		stampa2(iterator, lista2);
		System.out.println("Sostituendo ArrayList è necessario modificare sia creaRandom che stampa");
		
	}
	
	public static LinkedList<Integer> creaRandom(int n, int max){
		
		int item;
		LinkedList<Integer> lista=new LinkedList<Integer>();

        Random ran = new Random();
        for(int i=0; i<n; i++) {
        	item = ran.nextInt(max); 
    		lista.add(item);
        }
		return lista;
	}
	
	static <T> void stampa(Iterator<Integer> i, LinkedList<T> lista) {
		for (i= lista.iterator(); i.hasNext();) {
			   System.out.print(i.next()+" - ");
		}
	}
	
	public static ArrayList<Integer> creaRandom2(int n, int max){
		
		int item;
		ArrayList<Integer> lista=new ArrayList<Integer>();

        Random ran = new Random();
        for(int i=0; i<n; i++) {
        	item = ran.nextInt(max); 
    		lista.add(item);
        }
		return lista;
	}
	
	static void stampa2(Iterator<Integer> i, ArrayList<Integer> lista) {
		for (i= lista.iterator(); i.hasNext();) {
		   System.out.print(i.next()+" - ");
		}
	}
}
