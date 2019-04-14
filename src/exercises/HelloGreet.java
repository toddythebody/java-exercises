package exercises;
import java.util.Scanner;

public class HelloGreet {
    public static void main(String[] args) {
        System.out.println("Nice to meet you. What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello, " + name + ". My name is Java.");
    }
}
