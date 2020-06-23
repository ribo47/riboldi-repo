package esercizio2;

public interface Luminosita{
	
	public static void brighter(ElementoMultimediale e) {
		try {
			brighter((Immagine)e);
		}catch(ClassCastException np) {
			
			try {
				brighter((Video)e);
			}catch(ClassCastException np2) {
				System.out.println("Funzione non disponibile per questo formato");
			}
		}
	}
	
	public static void lighter(ElementoMultimediale e) {
		try {
			lighter((Immagine)e);
		}catch(ClassCastException np) {
			
			try {
				lighter((Video)e);
			}catch(ClassCastException np2) {
				System.out.println("Funzione non disponibile per questo formato");
			}
		}
	}
	
	public static void brighter(Immagine i) {
		i.setLuminosita(i.getLuminosita()+1);
		System.out.println("Luminosita corrente "+i.getLuminosita());

	}
	
	public static void lighter(Immagine i) {
		if(i.getLuminosita()>0)
			i.setLuminosita(i.getLuminosita()-1);
		System.out.println("Luminosita corrente "+i.getLuminosita());

	}
	
	public static void brighter(Video v) {
		
		v.setLuminosita(v.getLuminosita()+1);
		System.out.println("Luminosita corrente "+v.getLuminosita());
	

	}
	
	public static void lighter(Video v) {
		if(v.getLuminosita()>0)
			v.setLuminosita(v.getLuminosita()-1);
		System.out.println("Luminosita corrente "+v.getLuminosita());

	}
	


}
