package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        System.out.println("We are going to find your miles per gallon\nFirst, Give me your miles.");
        Scanner in = new Scanner(System.in);
        float miles = in.nextFloat();
        System.out.println("and how many gallons of gas did you use?");
        float gas = in.nextFloat();
        float Mpg = miles/gas;
        System.out.println("You got " + Mpg + " miles per gallon of gas.");
    }
}
