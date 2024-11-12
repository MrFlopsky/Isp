package aut.isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise_1_Test_2 {

    @Test
    public void testSetCurrentTime() {
        AquariumController aquariumController = new AquariumController("TestManufacturer", "TestModel");
        aquariumController.setCurrentTime(15.75f);
        assertEquals(15.75f, aquariumController.getCurrentTime(), 0.01);
    }
}
