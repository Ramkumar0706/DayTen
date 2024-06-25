package vechicleRentalSystem;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();
        boolean br=true;
        while (br) {
            System.out.println("1. Add a Vehicle");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Display Available Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter vehicle type (Car/Bike): ");
                    String vehicleType = scanner.nextLine();
                    System.out.println("Enter vehicle ID: ");
                    String vehicleId = scanner.nextLine();
                    System.out.println("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.println("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.println("Enter rental per day: ");
                    double rentalPerDay = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter status: ");
                    String status = scanner.nextLine();

                    if (vehicleType.equalsIgnoreCase("Car")) {
                        System.out.println("Enter seating capacity: ");
                        int seatingCapacity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Enter transmission (Manual/Automatic): ");
                        String transmission = scanner.nextLine();
                        rentalSystem.addVehicle(new Car(vehicleId, brand, model, year, rentalPerDay, status, seatingCapacity, transmission));
                    } else if (vehicleType.equalsIgnoreCase("Bike")) {
                        System.out.println("Enter engine capacity: ");
                        int engineCapacity = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter bike type: ");
                        String bikeType = scanner.nextLine();
                        rentalSystem.addVehicle(new Bike(vehicleId, brand, model, year, rentalPerDay, status, engineCapacity, bikeType));
                    } else {
                        System.out.println("Invalid vehicle type!");
                    }
                    break;

                case 2:
                    System.out.println("Enter vehicle ID to rent: ");
                    String rentVehicleId = scanner.nextLine();
                    System.out.println("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.println("Enter rental date (YYYY-MM-DD): ");
                    LocalDate rentalDate = LocalDate.parse(scanner.nextLine());
                    rentalSystem.rentVehicle(rentVehicleId, customerName, rentalDate);
                    break;

                case 3:
                    System.out.println("Enter rental ID to return the vehicle: ");
                    String rentalId = scanner.nextLine();
                    System.out.println("Enter return date (YYYY-MM-DD): ");
                    LocalDate returnDate = LocalDate.parse(scanner.nextLine());
                    rentalSystem.returnVehicle(rentalId, returnDate);
                    break;

                case 4:
                    System.out.println("Available Vehicles:");
                    rentalSystem.displayAvailableVehicles();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    br=false;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();
    }
}

