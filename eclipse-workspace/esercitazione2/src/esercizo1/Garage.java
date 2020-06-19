package esercizo1;

public class Garage {
	
	public Garage() {}
	
	public double repair(Vehicle v, int type) {
		
		double conto=10;
		//Se guasto aggiungo 30€ al conto
		if(v.isGuasto())
			conto+=30;
		//Se è un auto aggiungo 30€
		if(type==1)
			return conto+=30;
		//Se è una moto ne aggiungo 20€
		return conto+=20;
	}

}
