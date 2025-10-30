/*Write a program that takes the row & columns input from the user to 
populate a 2D array and then prints the array. */

package Day2.PracticeSession;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
       
        int[][] arr = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                 System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}