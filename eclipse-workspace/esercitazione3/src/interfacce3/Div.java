package interfacce3;

public class Div {

	private double a;
	private double b;
	
	public Div(double a, double b) {
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
	
	public double doDiv() {
		return Operazione.div(this.a, this.b);
	}

}
