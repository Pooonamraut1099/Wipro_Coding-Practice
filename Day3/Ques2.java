/*Find the sum of the digits using recursion */

package Day3;

import java.util.*;
public class Ques2{

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        String expression = "";

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            
            expression = digit + (expression.isEmpty() ? "" : "+" + expression);
            temp /= 10;
        }

        System.out.println(sum);
        sc.close();
    }
}