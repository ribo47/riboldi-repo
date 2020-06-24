package interfacce2;

public interface Comparable {
	
	public static Distributore compara(Distributore d1, Distributore d2) {
		if(d1.getCapacita()>d2.getCapacita())
			return d1;
		return d2;
	}

}
