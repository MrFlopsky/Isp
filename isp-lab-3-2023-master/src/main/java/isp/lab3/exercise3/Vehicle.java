package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;

    private static int numberOfVehicles = 0;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        numberOfVehicles++;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    // toString method
    @Override
    public String toString() {
        return "{" + model + " (" + type + ") speed " + speed + " fuel type " + fuelType + "}";
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed &&
                fuelType == vehicle.fuelType &&
                model.equals(vehicle.model) &&
                type.equals(vehicle.type);
    }

    // Static method to display number of Vehicle objects created
    public static void displayNumberOfVehicles() {
        System.out.println("Number of Vehicle objects created: " + numberOfVehicles);
    }
}

