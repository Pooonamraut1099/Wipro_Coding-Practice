/*Reverse each word in a string */

package Day2.PracticeSession;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        
        String str = "Learning Great";

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
}