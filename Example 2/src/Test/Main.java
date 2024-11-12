package Test;

import Example.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of Windshield, Wheel, CarMaker, and User if needed
        Windshield windshield = new Windshield();
        Wheel[] wheels = new Wheel[4];
        CarMaker carMaker = new CarMaker();
        User user = new User();

        // Create a Car instance
        Car car = new Car("Red", windshield, wheels, carMaker);

        // Test car functionalities
        car.start();
        car.go();
        car.stop();
    }
}
