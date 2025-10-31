//Sort the Collection
package Day6.PracticeSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        System.out.println("List before sort: " + list);

        Collections.sort(list);

        System.out.println("List after sort: " + list);

        sc.close();
    }
}
