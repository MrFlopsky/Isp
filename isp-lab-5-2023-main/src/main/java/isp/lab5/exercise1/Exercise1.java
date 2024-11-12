package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class Exercise1 {

    public static void main(String[] args) {
        // Creating instances of classes
        Address address = new Address("123 Main St", "Cityville");
        Customer customer = new Customer("C001", "John Doe", "1234567890", address);
        Product product = new Product("P001", "Laptop", 999.99, ProductCategory.ELECTRONICS);
        Order order = new Order("O001", LocalDateTime.now(), 100.0, customer, product);

        // Printing information
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Product Name: " + product.getName());
        // Similarly, you can access and print other information
    }
}

class Customer {
    private String customerId;
    private String name;
    private String phone;
    private Address address;

    public Customer(String customerId, String name, String phone, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters and setters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}

class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private Customer customer;
    private Product product;

    public Order(String orderId, LocalDateTime date, double totalPrice, Customer customer, Product product) {
        this.orderId = orderId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.product = product;
    }

    // Getters and setters
    public String getOrderId() {
        return orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
}

class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;

    public Product(String productId, String name, double price, ProductCategory productCategory) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    // Getters and setters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}
