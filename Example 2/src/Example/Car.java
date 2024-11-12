package Example;

public class Car extends Vehicle {
    private Windshield windshield;
    private Wheel[] wheels;
    private CarMaker carMaker;
    public Car(String color, Windshield windshield, Wheel[] wheels, CarMaker carMaker) {
        super(color);
        this.windshield = windshield;
        this.wheels = wheels;
        this.carMaker = carMaker;
    }
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void go() {
        System.out.println("Car is moving");
    }
}
