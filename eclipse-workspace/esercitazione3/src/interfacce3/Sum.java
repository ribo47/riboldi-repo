package interfacce3;

public class Sum implements Operazione{
	
	private double a;
	private double b;
	
	public Sum(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double doSum() {
		return Operazione.sum(this.a, this.b);
	}

}
