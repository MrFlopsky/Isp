package isp.lab3.exercise2;
public class Rectangle {
    private int length;
    private int width;
    private String color;

    // Default constructor
    public Rectangle() {
        this.length = 2;
        this.width = 1;
        this.color = "red";
    }

    // Overloaded constructor to set length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.color = "red"; // Default color
    }

    // Overloaded constructor to set length, width, and color
    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }


    public int getLength() {
        return length;
    }

    // Method to get the width of the rectangle
    public int getWidth() {
        return width;
    }

    // Method to get the color of the rectangle
    public String getColor() {
        return color;
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return length * width;
    }

}