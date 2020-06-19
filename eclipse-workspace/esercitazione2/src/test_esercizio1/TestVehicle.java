package test_esercizio1;

import esercizo1.Car;
import esercizo1.Motorcycle;
import esercizo1.Vehicle;

public class TestVehicle {
	
	private static final int numberVehicle=3;
	
	public static void main (String[] args) {
		
		Vehicle[] vehicle=new Vehicle[numberVehicle];
		int i=0;
	
		vehicle[0] = new Car("BMW", "aa123bc", "X5", false, "SUV");
		vehicle[1] = new Motorcycle("KTM", "bb123cc", "Duke", false, 125);
		vehicle[2] = new Car("Opel", "cc123bc", "Corsa", false, "Utilitaria");
		
		vehicle[1].setGuasto(true);
		
		for(i=0; i<numberVehicle; i++)
		{
			if(vehicle[i].isGuasto())
				System.out.println("Il veicolo "+vehicle[i].getTarga()+" è guasto");
		}	
	}
}
