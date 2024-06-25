package vechicleRentalSystem;

 abstract public class Vehicle {
	
	private String vehicleId;
	private String brand;
	private String model;
	private int year;
	private double rentalPerDay;
	private String status;
	
	public Vehicle(String vehicleId, String brand, String model, int year, double rentalPerDay, String status) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.rentalPerDay = rentalPerDay;
		this.status = status;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getRentalPerDay() {
		return rentalPerDay;
	}

	public String getStatus() {
		return status;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setRentalPerDay(double rentalPerDay) {
		this.rentalPerDay = rentalPerDay;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
