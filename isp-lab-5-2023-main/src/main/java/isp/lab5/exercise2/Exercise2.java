package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        // Create instances of Laptop, SmartPhone, SmartWatch, and test their charge methods here
    }
}

// Laptop class
class Laptop implements Chargeable {
    private int batteryLevel;

    @Override
    public void charge(int duration) {
        // Simulate charging the laptop
        batteryLevel += duration;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

// SmartPhone class
class SmartPhone implements Chargeable {
    private int batteryLevel;

    @Override
    public void charge(int duration) {
        // Simulate charging the smartphone
        batteryLevel += duration;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

// SmartWatch class
class SmartWatch implements Chargeable {
    private int batteryLevel;

    @Override
    public void charge(int duration) {
        // Simulate charging the smartwatch
        batteryLevel += duration;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}
