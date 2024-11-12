package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method checks if a number is prime
     * @param num the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method should return the product of the prime numbers between n and m
     * @param n starting number
     * @param m ending number
     * @return the product of prime numbers between n and m
     */
    public static long getPrimeProduct(int n, int m) {
        long product = 1;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                product *= i;
            }
        }
        return product;
    }

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int n = readFromConsoleInt();
        int m = readFromConsoleInt();

        if (n >= m) {
            System.out.println("n should be less than m.");
            return;
        }

        long product = getPrimeProduct(n, m);
        System.out.println("The product of prime numbers between " + n + " and " + m + " is: " + product);
    }
}
