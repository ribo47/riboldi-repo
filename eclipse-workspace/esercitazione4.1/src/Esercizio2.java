import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Esercizio2 {
	public static void main (String[] args) {
		provaEx2();
	}
	
	public static LinkedList<Integer> creaRandomCrescente(int n){
		int item;
		LinkedList<Integer> lista=new LinkedList<Integer>();

        Random ran = new Random();
    	item = ran.nextInt(10); 

        for(int i=0; i<n-1; i++) {
        	item += ran.nextInt(10);
    		lista.add(item);
        }
		return lista;
	}
	
	public static LinkedList<Integer> parseString(LinkedList<String> lista){
		LinkedList<Integer> listaInt=new LinkedList<Integer>();

		for (Iterator i= lista.iterator(); i.hasNext();) {
			try {
				listaInt.add(Integer.parseInt((String) i.next()));
			}
			catch(NumberFormatException n) {
				System.out.println("Formato dell'input errato");
			}
		}
		
		return listaInt;
	}
	
	public static void provaEx2() {
		LinkedList<Integer> lista1=new LinkedList<Integer>();
		lista1= creaRandomCrescente(10);
		
		for (Iterator i= lista1.iterator(); i.hasNext();) {
			   System.out.print(i.next()+" - ");
		}
		
		LinkedList<String> lista=new LinkedList<String>();
		lista.add("2");		lista.add("A");		lista.add("3");		lista.add("9");		lista.add("75");		lista.add("1");		lista.add("0");
		System.out.println("");

		lista1=parseString(lista);
		for (Iterator i= lista1.iterator(); i.hasNext();) {
			   System.out.print(i.next()+" - ");
		}
	}

}
