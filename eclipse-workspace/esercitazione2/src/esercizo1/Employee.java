package esercizo1;

public class Employee extends Person {
	
	private int annoAssunzione;
	private double stipendio;
	
	public Employee(String s, String n, String c, String tc, int aa, double st) {
		super(s, n, c, tc);
		annoAssunzione = aa;
		stipendio = st;
	}
	
	public Employee() {
		super();
		annoAssunzione = 0;
		stipendio = 0;
	}
	
	public int getAnnoAssunzione() {
		return annoAssunzione;
	}
	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	} 
	
	public boolean gainsMore(Employee employee) {
		if(this.stipendio>employee.stipendio)
			return true;
		return false;
	}
	
	public void visualize() {
		System.out.println(this.getName()+", "+this.getSurname()+", "+this.getCity()+", "+this.getTaxCode()+", "+
				this.annoAssunzione+", "+this.stipendio);
	}

}
