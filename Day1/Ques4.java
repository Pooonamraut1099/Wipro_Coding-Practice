/*Write a program in java to check whether the given number is an even number or not using if else statement.*/

package Day1.PracticeSession;
import java.util.*;
public class Ques4 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print("No is Even");
        }
        else{
            System.out.print("No is odd");
        }
     }
}

