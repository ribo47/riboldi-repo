package esercizo1;

public class Stagista extends Person{
	
	private int numberOfPresence;
	private int idNumber;
	
	public Stagista(String s, String n, String c, String tc, int nop, int id) {
		super(s, n, c, tc);
		numberOfPresence = nop;
		idNumber = id;
	}
	
	public Stagista() {
		super();
		numberOfPresence = 0;
		idNumber = 90;
	}
	
	public int getNumberOfPresence() {
		return numberOfPresence;
	}
	public void setNumberOfPresence(int numberOfPresence) {
		this.numberOfPresence = numberOfPresence;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	
	

}
