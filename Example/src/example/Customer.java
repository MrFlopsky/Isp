package example;

public class Customer extends Person {
    public Customer(String name, String address) {
        super(name, address);
    }
    public Customer() {}

    public void buyTablet() {
        System.out.println("customer buys a tablet");
    }

    public void buySmartphone() {
        System.out.println("customer buys a smartphone");
    }
}
