package aut.isp.lab4.exercise1;

public class Exercise_1 {

    public static void main(String[] args) {
        AquariumController aquariumController = new AquariumController("SomeManufacturer", "SomeModel");
        aquariumController.setCurrentTime(10.5f);
        System.out.println(aquariumController.toString());
    }
}
