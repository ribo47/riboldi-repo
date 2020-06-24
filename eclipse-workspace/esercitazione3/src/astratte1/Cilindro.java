package astratte1;

public class Cilindro extends CalcoloVolume{
	
	private double h;
	private double A;
	public Cilindro(double h, double a) {
		super();
		this.setH(h);
		setA(a);
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getA() {
		return A;
	}
	public void setA(double a) {
		A = a;
	}
	public double calcolo() {
		return this.A*this.h;	
	}
	
	public void stampa() {
		System.out.println("Il cilindro ha un volume di "+ this.calcolo());
	}

}
