import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {

    // Method to randomly select a word from an array of words (dictionary)
    public static String getRandomWord() {
        String[] dictionary = {"apple", "banana", "cherry", "orange", "grape", "melon","VoSiKe"};
        Random random = new Random();
        int index = random.nextInt(dictionary.length);
        return dictionary[index];
    }

    // Method to check if the guessed letter is in the word and return the positions
    public static int[] getOccurrencePositions(char c, String word) {
        int count = 0;
        for (char letter : word.toCharArray()) {
            if (letter == c) {
                count++;
            }
        }
        if (count == 0) {
            return null; // Letter not found in the word
        }
        int[] positions = new int[count];
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                positions[index++] = i + 1;
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        String word = getRandomWord(); // Get a random word from the dictionary
        int tries = 0;
        boolean solved = false;
        Scanner scanner = new Scanner(System.in);
        StringBuilder guessedLetters = new StringBuilder();

        while (tries < 10 && !solved) {
            tries++;
            System.out.println("Enter a letter: ");
            char letter = scanner.next().charAt(0);
            int[] occurrences = getOccurrencePositions(letter, word);

            if (occurrences != null) {
                System.out.println("The letter '" + letter + "' is in the word at position(s): ");
                for (int position : occurrences) {
                    System.out.print(position + " ");
                }
                System.out.println();
                guessedLetters.append(letter);
            } else {
                System.out.println("The letter '" + letter + "' is not in the word.");
            }

            // Check if the word is fully guessed
            solved = true;
            for (char c : word.toCharArray()) {
                if (!guessedLetters.toString().contains(String.valueOf(c))) {
                    solved = false;
                    break;
                }
            }
            if (solved) {
                System.out.println("Congratulations! You've guessed the word: " + word);
            } else {
                System.out.println("Guessed letters so far: " + guessedLetters);
            }
        }

        if (!solved) {
            System.out.println("Sorry, you've run out of tries. The word was: " + word);
        }
        System.out.println("Number of tries: " + tries);
        scanner.close();
    }
}
