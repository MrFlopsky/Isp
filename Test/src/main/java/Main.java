package main.java;

public interface Device {
    public static void start() {
        System.out.println("Starting Device");
    }

    public static void stop() {
        System.out.println("Stopping Device");
    }
}
package org.example;

public class Tablet implements Device{

    public void start() {
        System.out.println("Tablet started");
    }

    public void stop() {
        System.out.println("Tablet stopped");
    }
}
package org.example;

public class Smartphone implements Device{

    public void start() {
        System.out.println("Phone started");
    }

    public void stop() {
        System.out.println("Phone stopped");
    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Tablet> tablets;
    private List<Smartphone> smartphones;
    public Shop() {
        this.tablets = new ArrayList<>();
        this.smartphones = new ArrayList<>();
    }
    public void addTablets(List<Tablet> tablets) {
        this.tablets.addAll(tablets);
    }

    public void addSmartphone(List<Smartphone> smartphones) {
        this.smartphones.addAll(smartphones);
    }

    public void removeTablets(List<Tablet> tablets) {
        this.tablets.removeAll(tablets);
    }

    public void removeSmartphones(List<Smartphone> smartphones) {
        this.tablets.removeAll(smartphones);
    }

    public List<Tablet> getTablets() {
        return tablets;
    }

    public List<Smartphone> getSmartphones() {
        return smartphones;
    }
}
package org.example;

public class Person {
    public String name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
        super();
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setAddress(String a) {
        this.address = a;
    }
}
package org.example;

public class Customer extends Person {


    public Customer(String name, String address) {
        super(name, address);
    }
    public Customer() {
        super();
    }

    public void buyTablet() {
        System.out.println("customer buys a tablet");
    }

    public void buySmartphone() {
        System.out.println("customer buys a smartphone");
    }
}