package example;

public class Person {
    public String name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {}

    public void setName(String s) {
        this.name = s;
    }

    public void setAddress(String a) {
        this.address = a;
    }
}