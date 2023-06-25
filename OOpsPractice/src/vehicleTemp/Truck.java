package vehicleTemp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
	int maxLoad;
	public void print() {
		System.out.println(maxLoad);
		System.out.println(color);
		System.out.println(getMaxSpeed());
		
	}

}
