package vechicleRentalSystem;

public class Car extends Vehicle {
	
	int seatingCapacity;
    String transmission;
    
	public Car(String vehicleId, String brand, String model, int year, double rentalPerDay, String status,
			int seatingCapacity, String transmission) {
		super(vehicleId, brand, model, year, rentalPerDay, status);
		this.seatingCapacity = seatingCapacity;
		this.transmission = transmission;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public String getTransmission() {
		return transmission;
	}
	
	
    
    

}
