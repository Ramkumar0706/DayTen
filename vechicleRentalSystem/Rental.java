package vechicleRentalSystem;

import java.time.LocalDate;
import java.util.Date;

public class Rental {
	
	private String rentalId;
	private String vehicleId;
	private String customerName;
	private LocalDate rentalDate;
	private LocalDate returnDate;
    private double totalCharge;
	public Rental(String rentalId, String vehicleId, String customerName, LocalDate rentalDate2, LocalDate returnDate,
			double totalCharge) {
		this.rentalId = rentalId;
		this.vehicleId = vehicleId;
		this.customerName = customerName;
		this.rentalDate = rentalDate2;
		this.returnDate = returnDate;
		this.totalCharge = totalCharge;
	}

	public String getRentalId() {
		return rentalId;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public LocalDate getRentalDate() {
		return rentalDate;
	}
	
	public LocalDate getReturnDate() {
		return returnDate;
	}
	
	public double getTotalCharge() {
		return totalCharge;
	}


	public void setReturnDate(LocalDate returnDate) {
		this.returnDate=returnDate;
		
	}

	public void setTotalCharge(double calculateRentalCharges) {
		this.totalCharge=calculateRentalCharges;
		
	}


	
	
    
    

}
