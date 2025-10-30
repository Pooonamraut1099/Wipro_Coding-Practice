/*
Write a program that takes two numbers as input from the user and performs arithmetic
operations on them using the arithmetic operators 
(sum, difference, product, quotient, remainder) in Java.
*/

package Day1.PracticeSession;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));

        scanner.close();
    }
}
