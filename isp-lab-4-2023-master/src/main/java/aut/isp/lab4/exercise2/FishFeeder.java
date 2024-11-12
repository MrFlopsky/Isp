package aut.isp.lab4.exercise2;

public class FishFeeder {

    // Attributes
    private String manufacturer;
    private String model;
    private int meals;
    private static final int MAX_MEALS = 14;

    // Constructors
    public FishFeeder(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.meals = MAX_MEALS;
    }

    // Methods
    public void feed() {
        if (meals > 0) {
            meals--;
            System.out.println("Feeding fish. Remaining meals: " + meals);
        } else {
            System.out.println("No meals left to feed the fish.");
        }
    }

    public void fillUp() {
        meals = MAX_MEALS;
        System.out.println("Fish feeder filled up with " + MAX_MEALS + " meals.");
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}
