package esercizio2;

public interface Player {
	
	public static void louder(ElementoMultimediale e) {
		try {
			louder((Audio)e);
		}catch(ClassCastException np) {
			
			try {
				louder((Video)e);
			}catch(ClassCastException np2) {
				System.out.println("Funzione non disponibile per questo formato");
			}
		}
	}
	
	public static void weaker(ElementoMultimediale e) {
		try {
			weaker((Audio)e);
		}catch(ClassCastException np) {
			
			try {
				weaker((Video)e);
			}catch(ClassCastException np2) {
				System.out.println("Funzione non disponibile per questo formato");
			}
		}
	}
	
	public static void louder(Audio a) {
		a.setVolume(a.getVolume()+1);
		System.out.println("Volume corrente "+a.getVolume());

	}
	
	public static void weaker(Audio a) {
		if(a.getVolume()>0)
			a.setVolume(a.getVolume()-1);
		System.out.println("Volume corrente "+a.getVolume());

	}
	
	public static void louder(Video v) {
		v.setVolume(v.getVolume()+1);
		System.out.println("Volume corrente "+v.getVolume());

	}
	
	public static void weaker(Video v) {
		if(v.getVolume()>0)
			v.setVolume(v.getVolume()-1);
		System.out.println("Volume corrente "+v.getVolume());

	}

}
