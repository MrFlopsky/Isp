package isp.lab2.Exercise5EvenOddSearch;

import java.util.Scanner;

public class Exercise5EvenOddSearch {

    /**
     * This method finds the largest even number and the smallest odd number in the list,
     * along with their respective positions.
     * @param input the input string containing a list of integers separated by commas
     * @return an array containing the largest even number and the smallest odd number
     *         along with their respective positions, or null if there are no even or odd numbers
     */
    public static int[] findEvenOdd(String input) {
        String[] numbersStr = input.split(",");
        int largestEven = Integer.MIN_VALUE;
        int smallestOdd = Integer.MAX_VALUE;
        int positionOfLargestEven = -1;
        int positionOfSmallestOdd = -1;

        for (int i = 0; i < numbersStr.length; i++) {
            int num = Integer.parseInt(numbersStr[i]);
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
                positionOfLargestEven = i + 1;
            } else if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
                positionOfSmallestOdd = i + 1;
            }
        }

        if (largestEven == Integer.MIN_VALUE && smallestOdd == Integer.MAX_VALUE) {
            // No even or odd numbers found
            return null;
        }

        return new int[] { largestEven, positionOfLargestEven, smallestOdd, positionOfSmallestOdd };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas:");
        String input = scanner.nextLine();
        scanner.close();

        int[] result = findEvenOdd(input);
        if (result != null) {
            int largestEven = result[0];
            int positionOfLargestEven = result[1];
            int smallestOdd = result[2];
            int positionOfSmallestOdd = result[3];

            System.out.println("Largest even number: " + largestEven + ", position: " + positionOfLargestEven);
            System.out.println("Smallest odd number: " + smallestOdd + ", position: " + positionOfSmallestOdd);
        } else {
            System.out.println("No even or odd numbers found in the list.");
        }
    }
}
