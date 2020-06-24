package interfacce3;

public class Sub {

	private double a;
	private double b;
	
	public Sub(double a, double b) {
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
	
	public double doSub() {
		return Operazione.sub(this.a, this.b);
	}

}
