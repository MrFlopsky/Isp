package Example;

public class Vehicle {
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void go() {
        System.out.println("Vehicle is moving");
    }
}
