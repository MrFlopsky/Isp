package isp.lab3.example;

import isp.lab3.exercise4.MyPoint;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2, 3);
        MyPoint point2 = new MyPoint(4, 5, 6);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
    }
}
