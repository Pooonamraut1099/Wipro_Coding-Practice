/*Hashmap
Write a java program to remove an element from the Map, you can use the remove() method. This method takes the key value and

removes the mapping for a key from this map if it is present in the map.*/

package Day6.PracticeSession;
import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 1; i <= 4; i++) {
            String value = sc.next();
            map.put(i, value);
        }

        int keyToRemove = sc.nextInt();

        System.out.println("Mappings of HashMap are : " + map);

        map.remove(keyToRemove);

        System.out.println("Mappings after removal are : " + map);
    }
}
