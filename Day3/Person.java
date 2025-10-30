/*Classes & Objects in Java */
package Day3;
import java.util.Scanner;

public class Ques1{
    String name;
	int age;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		Person person = new Person();
		person.name = name;
		person.age = age;
		System.out.println("Name: " + person.name);
		System.out.println("Age: " + person.age);
	}
}
