package isp.lab3.example;

import isp.lab3.exercise1.Tree;

public class TreeTest {
    public static void testGrowMethod() {
        Tree tree = new Tree();
        System.out.println("Initial height: " + tree.toString());
        tree.grow(3);
        if (tree.toString().equals("18")) {
            System.out.println("Test for grow method passed");
        } else {
            System.out.println("Test for grow method failed");
        }
    }

    public static void testToStringMethod() {
        Tree tree = new Tree();
        if (tree.toString().equals("15")) {
            System.out.println("Test for toString method passed");
        } else {
            System.out.println("Test for toString method failed");
        }
    }

    public static void main(String[] args) {
        testGrowMethod();
        testToStringMethod();
    }
}
