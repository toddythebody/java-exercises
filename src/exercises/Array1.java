package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<String> words = new ArrayList<>(Arrays.asList("booger", "soda", "chicken", "mouse", "dog"));
        System.out.println(evenSum(numbers));
        fiveLetters(words);
        singleLine();
    }

    public static int evenSum(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }

    public static void fiveLetters(List<String> words) {
        for (String word : words) {
            if (word.length() >= 5) {
                System.out.println(word);
            }
        }
    }

    public static void singleLine() {
        List<Integer> digits = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8));
        for (int digit : digits) {
            System.out.println(digit);
        }
    }

}
