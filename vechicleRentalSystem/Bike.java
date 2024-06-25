package vechicleRentalSystem;

public class Bike  extends Vehicle {

	private int engineCapacity;
	private String bikeType;

	public Bike(String vehicleId, String brand, String model, int year, double rentalPerDay, String status,
			int engineCapacity, String bikeType) {
		super(vehicleId, brand, model, year, rentalPerDay, status);
		this.engineCapacity = engineCapacity;
		this.bikeType = bikeType;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public String getBikeType() {
		return bikeType;
	}




}
