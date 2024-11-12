package isp.lab3.example;

import isp.lab3.exercise3.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        // Create two Vehicle objects
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Toyota", "Corolla", 120, 'D');

        // Test getter and setter methods
        System.out.println("Vehicle 1: " + vehicle1);
        System.out.println("Vehicle 2: " + vehicle2);

        // Test if the two objects are equal
        if (vehicle1.equals(vehicle2)) {
            System.out.println("Vehicle 1 and Vehicle 2 are equal.");
        } else {
            System.out.println("Vehicle 1 and Vehicle 2 are not equal.");
        }

        // Display number of Vehicle objects created
        Vehicle.displayNumberOfVehicles();
    }
}

