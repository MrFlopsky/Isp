package aut.isp.lab4.exercise1;

public class AquariumController {

    // Attributes
    private String manufacturer;
    private String model;
    private float currentTime;

    // Constructors
    public AquariumController(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // Methods
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public float getCurrentTime() {
        return this.currentTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }
}
