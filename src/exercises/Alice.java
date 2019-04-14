package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        System.out.println("This is the first sentence of Alice in Wonderland:\n\nAlice was beginning to get very tired of sitting by her sister on the bank, and of\n having nothing to do: once or twice she had peeped into the book her sister was\n reading, but it had no pictures or conversations in it, 'and what is the use of\n a book,' thought Alice 'without pictures or conversation?'\n\nGive me a word, and I'll tell you if it is in the sentence.");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String wordLower = word.toLowerCase();
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String sentenceLower = sentence.toLowerCase();
        boolean answer = sentenceLower.contains(wordLower);
        System.out.println("The answer to your search is " + answer + ".");
    }
}
