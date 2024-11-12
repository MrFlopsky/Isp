package Test;

import example.*;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Tablet tablet = new Tablet();
        Smartphone smartphone = new Smartphone();
        Person person = new Person();
        Customer customer = new Customer();

        tablet.start();
        tablet.stop();

        smartphone.start();
        smartphone.stop();
    }
}
