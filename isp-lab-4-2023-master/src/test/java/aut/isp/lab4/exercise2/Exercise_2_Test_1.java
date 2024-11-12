package aut.isp.lab4.exercise2;

public class Exercise_2_Test_1 {

    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Model123", "ManufacturerXYZ");

        System.out.println("Initial state:");
        System.out.println(fishFeeder);

        fishFeeder.feed();
        fishFeeder.fillUp();

        System.out.println("After feeding and filling up:");
        System.out.println(fishFeeder);
    }
}
