package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4StringSearch {

    /**
     * This method should return an array of strings that contain the substring.
     * @param input the input string containing a list of words separated by commas
     * @param substring the substring to search for
     * @return an array of strings containing the words that contain the specified substring
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] splitInput = input.split(",");
        ArrayList<String> result = new ArrayList<>();

        for (String word : splitInput) {
            if (word.contains(substring)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static String readFromConsole(String suffix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + suffix);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = readFromConsole("words");
        String substring = readFromConsole("substring");
        String[] result = searchSubstrings(input, substring);

        System.out.println("Words containing the substring '" + substring + "':");
        for (String word : result) {
            System.out.println(word);
        }
    }
}
