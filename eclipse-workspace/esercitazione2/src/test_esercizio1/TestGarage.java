package test_esercizio1;

import esercizo1.Car;
import esercizo1.Garage;
import esercizo1.Motorcycle;
import esercizo1.Vehicle;

public class TestGarage {
	
private static final int numberVehicle=3;
	
	public static void main (String[] args) {
		
		Vehicle[] vehicle=new Vehicle[numberVehicle];
		Garage g = new Garage();
		int i=0;
	
		vehicle[0] = new Car("BMW", "aa123bc", "X5", false, "SUV");
		vehicle[1] = new Motorcycle("KTM", "bb123cc", "Duke", false, 125);
		vehicle[2] = new Car("Opel", "cc123bc", "Corsa", true, "Utilitaria");
		
		vehicle[1].setGuasto(true);
		
		for(i=0; i<numberVehicle; i++)
		{
			try {
				System.out.println(vehicle[i].getMarca());
				System.out.println(g.repair(vehicle[i], ((Motorcycle) vehicle[i]).getType()));
			}
			catch(ClassCastException e) {
				System.out.println(g.repair(vehicle[i], ((Car) vehicle[i]).getType()));
			};
	
		}	
	}

}
