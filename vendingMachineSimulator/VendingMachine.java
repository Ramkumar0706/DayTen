package vendingMachineSimulator;

public class VendingMachine {

	private Product[] products=new Product[50];
	private double balance;
	int index=0;

	public void addProduct(Product product) {
	    for (int i = 0; i < products.length; i++) {
	        if (products[i] != null && products[i].getName().equals(product.getName())) {
	            int q = product.getQuantity() + products[i].getQuantity();
	            products[i] = new Product(product.getName(), products[i].getPrice(), q);
	            return;
	        }
	    }
	    for (int i = 0; i < products.length; i++) {
	        if (products[i] == null) {
	            products[i] = product;
	            return;
	        }
	    }
	    if (index < products.length) {
	        products[index++] = product;
	    } else {
	        System.out.println("The vending machine is full. Cannot add more products.");
	    }
	}


	public void removeProduct(String productName) {
		for(int i=0;i<products.length;i++) {
			if(productName.equals(products[i].getName())) {
				products[i]=products[--index];
				products[index]=null;
				System.out.println(productName+" the product is reomved in the vending machine");
				return;
			}
		}
		System.out.println("The product is not found in the Vending Machine");
	}

	public void insertCoin(double coin) {
		if(coin>0) {
			balance=balance+coin;
			System.out.println("Your inserted amount is : "+coin);
			System.out.println("Total Balance is : "+balance);
		}
		else
			System.out.println("Please Enter the valid amount");
	}

	 public void selectProduct(String name) {
	        Product product = null;

	        for (int i = 0; i < products.length; i++) {
	            if (products[i] != null && name.equals(products[i].getName())) {
	                product = products[i];
	                break;
	            }
	        }

	        if (product != null) {
	            if (product.getQuantity() > 0) {
	                if (balance >= product.getPrice()) {
	                    balance -= product.getPrice();
	                    product.decrementProduct();
	                    System.out.println("Dispensed: " + product.getName());
	                    System.out.println("Remaining balance: $" + balance);
	                } else {
	                    System.out.println("Your balance is low. Add amount to buy the product.");
	                }
	            } else {
	                System.out.println("The product is out of stock.");
	            }
	        } else {
	            System.out.println("The product is not present in the vending machine.");
	        }
	    }

	public void refund() {
		System.out.println("your Amount is refunded : "+balance);
		balance=0.0;
	}

	public void avaiableProduct() {
		System.out.println(" the Avaiable Products are :");
		for (int i = 0; i < products.length; i++) {
			if(products[i]!=null)
			System.out.println(products[i]);
		}
	}


}


