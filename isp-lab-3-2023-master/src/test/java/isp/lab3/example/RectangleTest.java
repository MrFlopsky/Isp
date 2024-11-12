package isp.lab3.example;

import isp.lab3.exercise2.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        // Create a rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();

        // Test getLength() method
        int expectedLength = 2;
        int actualLength = rectangle.getLength();
        System.out.println("Length: " + actualLength + (actualLength == expectedLength ? " (Passed)" : " (Failed)"));

        // Test getWidth() method
        int expectedWidth = 1;
        int actualWidth = rectangle.getWidth();
        System.out.println("Width: " + actualWidth + (actualWidth == expectedWidth ? " (Passed)" : " (Failed)"));

        // Test getColor() method
        String expectedColor = "red";
        String actualColor = rectangle.getColor();
        System.out.println("Color: " + actualColor + (actualColor.equals(expectedColor) ? " (Passed)" : " (Failed)"));

        // Test getPerimeter() method
        int expectedPerimeter = 6; // (2 * (length + width))
        int actualPerimeter = rectangle.getPerimeter();
        System.out.println("Perimeter: " + actualPerimeter + (actualPerimeter == expectedPerimeter ? " (Passed)" : " (Failed)"));

        // Test getArea() method
        int expectedArea = 2; // (length * width)
        int actualArea = rectangle.getArea();
        System.out.println("Area: " + actualArea + (actualArea == expectedArea ? " (Passed)" : " (Failed)"));

        // Additional test cases if needed
    }
}