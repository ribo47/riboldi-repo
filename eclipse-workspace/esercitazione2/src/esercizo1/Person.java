package esercizo1;

import java.util.InputMismatchException;

public class Person {
	
	//surname, name, tax code e city
	private String surname;
	private String name;
	private String taxCode;
	private String city;
	
	public Person () {
		this.city=null;
		this.name=null;
		this.surname=null;
		this.taxCode=null;
	}
	
	public Person (String s, String n, String c, String tc) {
		this.city=c;
		this.name=n;
		this.surname=s;
		this.taxCode=tc;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int bornYear(String cf) {
		char anno1, anno2;
		try {
			anno1=cf.charAt(6);
			anno2=cf.charAt(7);
			
		}
		catch (StringIndexOutOfBoundsException e) {
	         return 0;
	     }
		int s = (Character.getNumericValue(anno1)*10)+Character.getNumericValue(anno2);
		//Ipotoizzando che un o stagista non possa essere preso da minorenne e che non esista uno stagista di 118 anni
		if(s<=2)
			s+=2000;
		else
			s+=1900;

		return s;
	}

}
