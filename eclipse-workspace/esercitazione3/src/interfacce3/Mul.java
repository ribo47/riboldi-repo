package interfacce3;

public class Mul {

	private double a;
	private double b;
	
	public Mul(double a, double b) {
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
	
	public double doMul() {
		return Operazione.mul(this.a, this.b);
	}

}
