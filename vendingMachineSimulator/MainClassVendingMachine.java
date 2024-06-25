package vendingMachineSimulator;

import java.util.Scanner;

public class MainClassVendingMachine {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        VendingMachine machine = new VendingMachine();
        
        while (true) {
            machine.avaiableProduct();
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Insert Coin");
            System.out.println("4. Select Product");
            System.out.println("5. Refund");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    Product product = new Product(name, price, quantity);
                    machine.addProduct(product);
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productNameToRemove = scanner.nextLine();
                    machine.removeProduct(productNameToRemove);
                    break;

                case 3:
                    System.out.print("Enter coin amount: ");
                    double coin = scanner.nextDouble();
                    machine.insertCoin(coin);
                    break;

                case 4:
                    System.out.print("Enter product name to select: ");
                    String productNameToSelect = scanner.nextLine();
                    machine.selectProduct(productNameToSelect);
                    break;

                case 5:
                    machine.refund();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
