/*Write a program that takes two boolean values as input and performs logical 
operations (AND, OR) on them using the logical operators& print the result.*/

package Day1;
import java.util.*;
public class Que2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input1 = scanner.nextBoolean();
        boolean input2 = scanner.nextBoolean();

        System.out.println(input1 && input2);
        System.out.println(input1 || input2);

        scanner.close();
    }
}

