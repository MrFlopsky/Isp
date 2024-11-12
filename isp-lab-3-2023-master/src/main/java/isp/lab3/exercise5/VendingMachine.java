package isp.lab3.exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    private Map<Integer, String> products;
    private int credit;
    private static int numVendingMachines = 0;

    public VendingMachine() {
        this.products = new HashMap<>();
        this.credit = 0;
        initializeProducts();
        numVendingMachines++;
    }

    private void initializeProducts() {
        products.put(1, "Cola");
        products.put(2, "Chips");
        products.put(3, "Chocolate");
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public void insertCoin(int value) {
        credit += value;
    }

    public String selectProduct(int id) {
        if (products.containsKey(id)) {
            String product = products.get(id);
            if (credit >= 100) {
                credit -= 100; // Assuming the product costs 100 credits
                return product;
            } else {
                return "Insufficient credit. Please insert more coins.";
            }
        } else {
            return "Invalid product selection.";
        }
    }

    public void displayCredit() {
        System.out.println("Current credit: " + credit);
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nVending Machine Menu:");
            System.out.println("1. Display Products");
            System.out.println("2. Insert Coin");
            System.out.println("3. Select Product");
            System.out.println("4. Display Credit");
            System.out.println("5. Display Number of Vending Machines");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.print("Enter coin value: ");
                    int value = scanner.nextInt();
                    insertCoin(value);
                    break;
                case 3:
                    System.out.print("Enter product id: ");
                    int productId = scanner.nextInt();
                    String selectedProduct = selectProduct(productId);
                    System.out.println(selectedProduct);
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    displayNumVendingMachines();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static int getNumVendingMachines() {
        return numVendingMachines;
    }

    public static void displayNumVendingMachines() {
        System.out.println("Number of Vending Machines created: " + numVendingMachines);
    }

}

