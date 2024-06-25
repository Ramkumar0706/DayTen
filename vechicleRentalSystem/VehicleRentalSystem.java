package vechicleRentalSystem;

import java.time.LocalDate;

public class VehicleRentalSystem {
    private Vehicle[] vehicles = new Vehicle[100];
    private Rental[] rentals = new Rental[100];
    private int vehicleCount = 0;
    private int rentalCount = 0;

    public void addVehicle(Vehicle vehicle) {
        if (vehicleCount < 100) {
            vehicles[vehicleCount++] = vehicle;
            System.out.println("Vehicle " + vehicle.getVehicleId() + " added to the fleet.");
        } else {
            System.out.println("Cannot add more vehicles. Fleet capacity reached.");
        }
    }

    public void rentVehicle(String vehicleId, String customerName, LocalDate rentalDate) {
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle.getVehicleId().equalsIgnoreCase(vehicleId) && vehicle.getStatus().equalsIgnoreCase("Available")) {
                vehicle.setStatus("Rented");
                Rental rental = new Rental("RENTAL" + (rentalCount + 1), vehicleId, customerName, rentalDate, null, 0);
                rentals[rentalCount++] = rental;
                System.out.println("Vehicle " + vehicleId + " rented to " + customerName + ".");
                return;
            }
        }
        System.out.println("Vehicle " + vehicleId + " is not available.");
    }

    public void returnVehicle(String rentalId, LocalDate returnDate) {
        for (int i = 0; i < rentalCount; i++) {
            Rental rental = rentals[i];
            if (rental.getRentalId().equalsIgnoreCase(rentalId)) {
                rental.setReturnDate(returnDate);
                int totalDays=0;
                LocalDate startDate=rental.getRentalDate();
                while (!startDate.isEqual(returnDate)) {
                    startDate = startDate.plusDays(1);
                    totalDays++;
                }
                for (int j = 0; j < vehicleCount; j++) {
                    Vehicle vehicle = vehicles[j];
                    if (vehicle.getVehicleId().equals(rental.getVehicleId())) {
                        rental.setTotalCharge(calculateRentalCharges(totalDays, vehicle.getRentalPerDay()));
                        vehicle.setStatus("Available");
                        System.out.println("Vehicle " + rental.getVehicleId() + " returned. Total charge: " + rental.getTotalCharge());
                        return;
                    }
                }
            }
        }
        System.out.println("Rental " + rentalId + " not found.");
    }

    private double calculateRentalCharges(long rentalDuration, double rentalPerDay) {
        return rentalDuration * rentalPerDay;
    }

    public void displayAvailableVehicles() {
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle.getStatus().equalsIgnoreCase("Available")) {
                System.out.println(vehicle.getVehicleId() + ": " + vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getYear() + ")");
            }
        }
    }
}
