package exercises;
import java.util.Scanner;

public class RecArea {
    public static void main(String[] args) {
        System.out.println("We are going to find the area of a rectangle");
        System.out.println("First, give me the height.");
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        System.out.println("Now give me the width.");
        int width = in.nextInt();
        int area = height * width;
        System.out.println("The area of our rectangle is " + area + ".");
    }
}
