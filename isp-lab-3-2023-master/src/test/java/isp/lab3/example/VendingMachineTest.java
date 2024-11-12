package isp.lab3.example;

import isp.lab3.exercise5.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Testing displayProducts method
        vendingMachine.displayProducts();

        // Testing insertCoin method
        vendingMachine.insertCoin(50);
        vendingMachine.displayCredit();

        // Testing selectProduct method
        System.out.println(vendingMachine.selectProduct(1));

        // Testing static attribute and method
        System.out.println("Number of vending machines created: " + VendingMachine.getNumVendingMachines());
        VendingMachine.displayNumVendingMachines();
    }
}
