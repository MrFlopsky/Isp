package isp.lab5.exercise1;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {

    @Test
    public void testGetCustomer() {
        // Creating an Address object
        Address address = new Address("123 Main St", "Cityville");

        // Creating a Customer object
        Customer customer = new Customer("C001", "John Doe", "1234567890", address);

        // Creating a Product object
        Product product = new Product("P001", "Laptop", 999.99, ProductCategory.ELECTRONICS);

        // Creating an Order object
        Order order = new Order("O001", LocalDateTime.now(), 100.0, customer, product);

        // Verify that the getCustomer() method returns the correct customer
        assertEquals(customer, order.getCustomer());
    }
}
