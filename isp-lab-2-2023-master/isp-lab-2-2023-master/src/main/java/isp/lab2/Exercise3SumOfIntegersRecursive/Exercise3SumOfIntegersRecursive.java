package isp.lab2.Exercise3SumOfIntegersRecursive;

import java.util.Scanner;

public class Exercise3SumOfIntegersRecursive {

    /**
     * This method will return the sum of the first n integers
     * @param n
     * @return sum of integers from 1 to n
     */
    public static int sumOfIntegers(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: add n to the sum of integers from 1 to n-1
        return n + sumOfIntegers(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the value of n
        System.out.print("Enter the value of n: ");

        // Read the value of n from the console
        int n = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the sum of integers from 1 to n and print the result
        System.out.println("The sum of all positive integers from 1 to " + n + " is: " + sumOfIntegers(n));
    }
}
