package isp.lab5.exercise2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise2Test {

    @Test
    public void testCharge() {
        // Create instances of Laptop, SmartPhone, SmartWatch
        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        // Charge the devices for different durations
        laptop.charge(60); // Charge laptop for 1 hour
        smartPhone.charge(90); // Charge smartphone for 30 minutes
        smartWatch.charge(15); // Charge smartwatch for 15 minutes

        // Validate battery levels after charging
        assertEquals("Laptop battery level should be 60 after charging for 1 hour", 60, laptop.getBatteryLevel());
        assertEquals("SmartPhone battery level should be 30 after charging for 30 minutes", 90, smartPhone.getBatteryLevel());
        assertEquals("SmartWatch battery level should be 15 after charging for 15 minutes", 15, smartWatch.getBatteryLevel());
    }
}
