package esercizio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Alimentare extends Prodotto{
	
	private LocalDate scandenza;
	private static final LocalDate today = LocalDate.of(2020, 6, 22);

	
	public Alimentare(int barcode, String descrizione, double prezzo, LocalDate scadenza) {
		super(barcode, descrizione, prezzo);	
		setScandenza(scadenza);
	}

	public Alimentare() {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getScandenza() {
		return scandenza;
	}

	public void setScandenza(LocalDate scandenza) {
		this.scandenza = scandenza;
	}
	
	public double applicaSconto() {
		/*Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 240));
		
		Calendar c = Calendar.getInstance(); 
		c.setTime(today); 
		c.add(Calendar.DATE, 10);
		System.out.println(this.scandenza.compareTo(c.getTime()));
		System.out.println(tomorrow);
		System.out.println(today);*/
		
		
		

		if(this.scandenza.compareTo(today.plusDays(10))<0)
			return this.prezzo*0.80;
		return this.prezzo;
	}

}
