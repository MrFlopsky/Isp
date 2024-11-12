package isp.lab3.exercise2;

public class RectangleModel {
    public static void main(String[] args) {
        // Create a rectangle object using the default constructor
        Rectangle rectangle1 = new Rectangle();

        // Print out the properties of the rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println();

        // Create a rectangle object using the overloaded constructor with length and width
        Rectangle rectangle2 = new Rectangle(3, 4);

        // Print out the properties of the rectangle
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println();

        // Create a rectangle object using the overloaded constructor with length, width, and color
        Rectangle rectangle3 = new Rectangle(5, 6, "blue");

        // Print out the properties of the rectangle
        System.out.println("Rectangle 3:");
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Color: " + rectangle3.getColor());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println();



        // Call all methods and print out the values
        System.out.println("Rectangle properties:");
        Rectangle rectangle = new Rectangle();
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}