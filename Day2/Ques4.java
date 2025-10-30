/*Equal character in string */

package Day2.PracticeSession;

import java.util.Scanner;
public class Ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxFreq = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        int moves = str.length() - maxFreq;
        System.out.println(moves);
    }
    }